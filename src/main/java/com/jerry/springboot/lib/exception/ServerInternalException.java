package com.jerry.springboot.lib.exception;

import com.jerry.springboot.lib.enums.ResultEnum;

public class ServerInternalException extends RuntimeException{  //只有RuntimeException才能被ExceptionHandler拦截

    private Integer code;

    public ServerInternalException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
