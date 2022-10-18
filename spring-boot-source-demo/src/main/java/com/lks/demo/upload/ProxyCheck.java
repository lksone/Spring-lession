package com.lks.demo.upload;

import com.alibaba.fastjson.JSONArray;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/10/8 16:17
 */
@RestController
@RequestMapping(value = "/proxy")
public class ProxyCheck {

    @RequestMapping(value="/restTemplate", method = RequestMethod.GET)
    public Map<String, Object> apiProxyGet (HttpServletRequest request, HttpServletResponse res) throws UnsupportedEncodingException {
        // 获取请求url
        String url = request.getRequestURL().toString();
        // 获取url中携带的参数，即/resTemplate?后面的内容
        String query = request.getQueryString();


        String target = "http://127.0.0.1:9999";

        // 新的url拼接上旧url后的请求参数
        if (query != null && !query.equals("") && !query.equals("null")) {
            target = target + "?" + query;
        }
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));

        // 获取到请求头
        Enumeration<String> headerNames = request.getHeaderNames();

        HttpHeaders headers = new HttpHeaders();
        Map<String, String> headerMap = new HashMap<>();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String header = request.getHeader(headerName);
            headerMap.put(headerName, header);
            headers.add(headerName, header);
        }

        // 构造HttpEntity，新请求会携带本次请求的请求头
        HttpEntity entity = new HttpEntity<String>(headers);
        ResponseEntity<String> response = restTemplate.getForEntity(target, String.class, entity);
        Map<String, Object> list = JSONArray.parseObject(response.getBody(), Map.class);
        // 当需要分页时，返回分页信息
        res.setStatus(HttpServletResponse.SC_PARTIAL_CONTENT);
        res.setHeader("Content-Range", String.valueOf(list.size()));
        res.setHeader("Access-Control-Expose-Headers", "Content-Range");

        return list;

    }

    @PostMapping("/upload")
    @ApiOperation("文件上传")
    public String upload(@RequestPart("multipartFile") MultipartFile multipartFile,
                         @RequestPart("photos") MultipartFile[] multipartFiles) throws IOException {
        if (!multipartFile.isEmpty()){
            String originalFilename = multipartFile.getOriginalFilename();
            System.out.println(originalFilename+2);
            multipartFile.transferTo(new File("D:\\"+originalFilename));
        }
        if (multipartFiles.length>0){
            for (MultipartFile file : multipartFiles) {
                if (!file.isEmpty()){
                    System.out.println(file.getOriginalFilename()+1);
                    String originalFilename = file.getOriginalFilename();
                    file.transferTo(new File("D:\\"+originalFilename));
                }
            }
        }
        return "true";
    }
}
