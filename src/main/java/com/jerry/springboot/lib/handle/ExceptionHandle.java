package com.jerry.springboot.lib.handle;

import com.jerry.springboot.domain.Result;
import com.jerry.springboot.lib.exception.ServerInternalException;
import com.jerry.springboot.utils.ResultUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if (e instanceof ServerInternalException){
            return ResultUtils.error(((ServerInternalException) e).getCode(), e.getMessage());
        }
        return ResultUtils.error(100, e.getMessage());
    }

}
