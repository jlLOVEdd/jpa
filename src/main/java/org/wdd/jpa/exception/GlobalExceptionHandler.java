package org.wdd.jpa.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public ResponseResult BusinessHandler(BusinessException e){
        ResponseResult responseResult = new ResponseResult(e.getCode(),e.getMsg());
        return  responseResult;
    }

}
