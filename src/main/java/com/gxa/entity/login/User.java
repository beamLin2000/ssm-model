package com.gxa.entity.login;

import lombok.Data;

@Data
public class User {
    private int id;
    private String userName;
    private String pwd;
    private String salt;
}
