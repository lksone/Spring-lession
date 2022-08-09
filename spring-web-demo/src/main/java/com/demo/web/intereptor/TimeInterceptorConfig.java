package com.demo.web.intereptor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/6/9 00:00
 */
public class TimeInterceptorConfig extends WebMvcConfigurerAdapter {

    /**
     * 拦截器1
     */
    @Autowired
    private LoginIntereptor loginIntereptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        InterceptorRegistration timeTwo = registry.addInterceptor(loginIntereptor);
        //配置拦截路径
        timeTwo.addPathPatterns("/*");
        //忽略拦截路径
        timeTwo.excludePathPatterns("/do");
    }
}
