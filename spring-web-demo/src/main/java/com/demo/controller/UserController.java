package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lks
 * @date 2020/10/25
 */
@Controller
public class UserController {


    @RequestMapping("/find.do")
    public String teet() {
        System.out.println("执行调用的方法");
        return "当前对象是否返回";
    }
}
