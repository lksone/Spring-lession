package com.demo.intereptor;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 说明：错误异常拦截处理
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/6/8 23:16
 */
public class ExceptionResolver implements HandlerExceptionResolver {

    /**
     * 拦截异常拦截器
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView(new MappingJackson2JsonView());
        String exInfo = ex.toString().replaceAll("n", "<br/>");
        boolean status = exInfo.contains("Subject does not have permission");
        if (status) {
            exInfo = "[没有此页面的访问权限]" + exInfo;
        } else {
            System.out.println("==============异常开始=============");
            ex.printStackTrace();
            System.out.println("==============异常结束=============");
        }
        mv.addObject("exception", exInfo);
        mv.addObject("result", "exception");

        return mv;
    }
}
