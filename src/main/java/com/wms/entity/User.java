package com.wms.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String account;
    private int sex;
    private String name;
    private String password;
    private int roleId;
    private String phone;

    // 省略构造函数、getter和setter方法


}