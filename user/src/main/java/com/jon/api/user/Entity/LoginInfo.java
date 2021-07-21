package com.jon.api.client.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

// 存放登陆信息
@Data
@AllArgsConstructor
@NoArgsConstructor
@NonNull  // ??
public class LoginInfo {

    private String email;
    private String password;

}
