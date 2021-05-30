package com.yeasheng.cloudstore.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 产品实体类
 * @author yansh
 * @version 2021/5/30
 **/
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Product implements Serializable {

    private String productId;

    private String productName;

    private String dbSource;
}
