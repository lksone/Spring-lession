package com.lks.demo.utils;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author lks
 * @E-mail 13552418058@163.com
 * @Since 1.0
 * @Date 2022/10/9 18:23
 */
@Slf4j
public class HttpClient {

    private HttpClient() {
    }

    /**
     * 文件上传
     *
     * @param url
     * @param file
     */
    public static void upload(String url, File file) {
        try {
            //需要传入的文件
            CloseableHttpClient httpClient = HttpClients.createDefault();
            //url 调用接口传递文件
            HttpPost httpPost = new HttpPost(url);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] buffer = new byte[(int) file.length()];
            fileInputStream.read(buffer);
            fileInputStream.close();
            InputStream inputStream = new ByteArrayInputStream(buffer);
            MultipartEntityBuilder builder = MultipartEntityBuilder.create().setMode(HttpMultipartMode.RFC6532);
            // 把文件加到HTTP的post请求中
            builder.addBinaryBody("files", inputStream, ContentType.MULTIPART_FORM_DATA, file.getName());
            HttpEntity multipart = builder.build();
            httpPost.setEntity(multipart);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            HttpEntity responseEntity = response.getEntity();
            String responseJsonString = EntityUtils.toString(responseEntity, "UTF-8");
            log.info("调用上传文件接口返回结果===>>" + responseJsonString);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 文件上传(并不好使)
     *
     * @param file
     * @param url
     * @param paramMap
     */
    public static void upload2(String url,File file,  Map<String,Object> paramMap){
        PostMethod filePost = new PostMethod(url);
        org.apache.commons.httpclient.HttpClient client = new org.apache.commons.httpclient.HttpClient();

        try {
            // 通过以下方法可以模拟页面参数提交
            if(paramMap!=null && !paramMap.isEmpty()){
                paramMap.entrySet().forEach(stringObjectEntry -> {
                    filePost.addParameter(stringObjectEntry.getKey(), (String) stringObjectEntry.getValue());
                });
            }
            Part[] parts = { new FilePart(file.getName(), file) };
            filePost.setRequestEntity(new MultipartRequestEntity(parts, filePost.getParams()));
            client.getHttpConnectionManager().getParams().setConnectionTimeout(50000);
            int status = client.executeMethod(filePost);
            if (status == HttpStatus.SC_OK) {
                System.out.println("上传成功");
            } else {
                System.out.println("上传失败");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            filePost.releaseConnection();
        }
    }

    public static String upload3(String url,File file,  Map<String,Object> paramMap){
        if(paramMap!=null && !paramMap.isEmpty()){
            paramMap = new HashMap<>();
        }
        String result = HttpRequest.post(url)
                .form("file", file)
                .execute().body();
        if(result==null){
            return "SUCCESS";
        }
        JSONObject object = JSONUtil.parseObj(result);
        if(object==null){
            return "SUCCESS";
        }
        JSONObject data = JSONUtil.parseObj(object.get("data"));
        return  result;
    }
}
