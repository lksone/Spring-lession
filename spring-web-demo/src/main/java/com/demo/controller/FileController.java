package com.demo.controller;

import com.alibaba.excel.EasyExcel;
import com.demo.common.Result;
import com.demo.excel.NoModleDataListener;
import com.demo.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/11/21 20:39
 */
@RestController
@Slf4j
@RequestMapping("demo/file")
public class FileController {


    @ResponseBody
    @RequestMapping(value = "orderImport")
    public Result orderImport(HttpServletRequest request, @RequestParam(value = "file") MultipartFile file) throws Exception {
        UserVO userVo = this.getCurrentUser(request);
        // 初始化ajax返回对象 默认是操作成功
        Result build = new Result();
        EasyExcel.read(file.getInputStream(), new NoModleDataListener(orderService, userVo, build)).sheet().doRead();
        // 直接返回  如果错误这个对象的值已被改变 如果没有错误值没有被改变 返回的是默认成功的对象
        return build;
    }
}
