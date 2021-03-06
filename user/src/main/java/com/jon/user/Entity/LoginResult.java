package com.jon.user.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResult {

    private Integer code; // 状态码
    private String msg;
    private String token;
    private Object result; // 响应的数据
}
