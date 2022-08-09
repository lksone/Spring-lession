package com.demo.web.intereptor;

import com.demo.web.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.websocket.AuthenticationException;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yaml.snakeyaml.constructor.DuplicateKeyException;

import javax.xml.bind.ValidationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 全局异常拦截器
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/6/8 23:06
 */
@RestControllerAdvice
@Order(-1)
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(DuplicateKeyException.class)
    public Result<?> handleDuplicateKeyException(DuplicateKeyException e) {
        log.error(e.getMessage(), e);
        return Result.error("数据库中已存在该记录");
    }

    @ExceptionHandler(AuthenticationException.class)
    public Result<?> authenticationExceptionException(DuplicateKeyException e) {
        log.error(e.getMessage(), e);
        return Result.error("Token已失效");
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<?> methodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.error(e.getMessage(), e);
        List<Map<String, Object>> list = new ArrayList<>();
        List<FieldError> errorList = e.getBindingResult().getFieldErrors();
        errorList.forEach(fieldError -> {
            Map<String, Object> map = new HashMap<>();
            map.put(fieldError.getField(), fieldError.getDefaultMessage());
            list.add(map);
        });
        return Result.error(HttpStatus.EXPECTATION_FAILED.value(), "参数异常");
    }

    /**
     * 自定义校验报错
     *
     * @param e
     * @return
     */
    @ExceptionHandler(ValidationException.class)
    public Result<?> validationException(ValidationException e) {
        log.error(e.getMessage(), e);
        return Result.error("参数异常");
    }
}

