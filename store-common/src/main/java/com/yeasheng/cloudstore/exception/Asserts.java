package com.yeasheng.cloudstore.exception;


import com.yeasheng.cloudstore.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 *
 * @author yansh
 * @version 2021/5/30
 **/
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
