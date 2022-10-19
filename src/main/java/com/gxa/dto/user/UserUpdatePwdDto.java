package com.gxa.dto.user;

import lombok.Data;

@Data
public class UserUpdatePwdDto {
    private String userName;
    private String oldPwd;
    private String newPwd;
}
