package com.jerry.springboot.utils;

import com.jerry.springboot.domain.Result;

public class ResultUtils {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setData(object);
        result.setMsg("success");
        return result;
    }

    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
