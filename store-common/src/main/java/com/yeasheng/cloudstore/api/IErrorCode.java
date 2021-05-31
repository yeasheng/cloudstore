package com.yeasheng.cloudstore.api;

/**
 * 封装API的错误码
 *
 * @author yansh
 * @version 2021/5/30
 **/
public interface IErrorCode {

    long getCode();

    String getMessage();
}
