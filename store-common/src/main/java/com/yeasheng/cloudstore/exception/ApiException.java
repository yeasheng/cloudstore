package com.yeasheng.cloudstore.exception;


import com.yeasheng.cloudstore.api.IErrorCode;

/**
 * 自定义API异常
 *
 * @author yansh
 * @version 2021/5/30
 **/
public class ApiException extends RuntimeException {
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
