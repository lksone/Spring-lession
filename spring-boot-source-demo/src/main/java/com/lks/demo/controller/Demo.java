package com.lks.demo.controller;

import com.lks.demo.utils.HttpClient;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * @Author lks
 * @E-mail 13552418058@163.com
 * @Since 1.0
 * @Date 2022/10/9 18:25
 */
@Controller
@RequestMapping("mx")
public class Demo {


    @RequestMapping(value = "download", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public void method(HttpServletRequest request, HttpServletResponse response) {
        try {
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            // 获取上传文件对象
            MultipartFile file = multipartRequest.getFile("files");
            String originalFilename = file.getOriginalFilename();
            File savefile = new File("E:\\temp\\" + originalFilename);
            FileCopyUtils.copy(file.getBytes(), savefile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @RequestMapping(value = "upload", method = {RequestMethod.POST})
    @ResponseBody
    public void upload(HttpServletRequest request, HttpServletResponse response) {
        HttpClient.upload("http://127.0.0.1:8001/mx/download", new File("E:\\12312312.txt"));
    }

    @RequestMapping(value = "upload3", method = {RequestMethod.POST})
    @ResponseBody
    public void upload2(HttpServletRequest request, HttpServletResponse response) {
        HttpClient.upload3("http://127.0.0.1:8001/mx/download", new File("E:\\12312312.txt"),null);
    }
}
