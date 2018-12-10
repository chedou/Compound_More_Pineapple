package com.jnshu.resourceservice.exception;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
/**
 * @description 异常处理类
 * @author Mr.HUANG
 * @date 2018/12/6
 */
@ControllerAdvice
@ResponseBody
public class ExceptionHandle {
    @ExceptionHandler(UserLoginException.class)
    public ResponseEntity<String> handleException(Exception e) {

        return new ResponseEntity(e.getMessage(), HttpStatus.OK);
    }
}
