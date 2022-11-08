package com.demo.socket;


import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * 远程socket连接
 */
public class SocketThread implements Runnable {

    private static final Logger log = Logger.getLogger(SocketThread.class);

    private static final int SO_TIME_OUT = 30000;

    private static final int BUFFER_SIZE = 8092;

    /**
     * 本地Sokcet
     */
    private final Socket localSocket;

    /**
     * 远程Port
     */
    private final Integer remotePort;

    /**
     * 远程host
     */
    private final String remoteHost;

    /**
     * 远程Host
     */
    private Socket remoteSocket;

    private InputStream remoteSocketInputStream;
    private OutputStream localSocketOutputStream;

    public SocketThread(Socket localSocket, Integer remotePort, String remoteHost) {
        this.localSocket = localSocket;
        this.remotePort = remotePort;
        this.remoteHost = remoteHost;
    }

    @Override
    public void run() {
        try {
            remoteSocket = new Socket();
            remoteSocket.connect(new InetSocketAddress(remoteHost, remotePort));
            //设置超时时间
            remoteSocket.setSoTimeout(SO_TIME_OUT);
            //远程
            remoteSocketInputStream = remoteSocket.getInputStream();
            OutputStream remoteSocketOutputStream = remoteSocket.getOutputStream();
            //本地流
            localSocketOutputStream = localSocket.getOutputStream();
            InputStream localSocketInputStream = localSocket.getInputStream();
            //将返回的信息写入到本地流中
            new ReadThread().start();
            dataTransmission(localSocketInputStream, remoteSocketOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    /**
     * 关闭
     */
    private void close() {
        try {
            if (localSocket != null && !localSocket.isClosed()) {
                localSocket.close();
            }
            if (remoteSocket != null && !remoteSocket.isClosed()) {
                remoteSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读数据线程负责读取远程数据后回写到客户端
     */
    class ReadThread extends Thread {
        @Override
        public void run() {
            try {
                //读取远程的流数据信息，写入到本地socket
                dataTransmission(remoteSocketInputStream, localSocketOutputStream);
            } catch (IOException e) {
                log.warn(e);
            } finally {
                close();
            }
        }
    }

    /**
     * 数据转换
     *
     * @param inputStream
     * @param outputStream
     * @throws IOException
     */
    private void dataTransmission(InputStream inputStream, OutputStream outputStream) throws IOException {
        int len = -1;
        byte[] buffer = new byte[1024 * 1024 * 1];
        while ((len = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
        }
    }
}
