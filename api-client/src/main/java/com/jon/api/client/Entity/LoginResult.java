package com.jon.api.client.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResult {

    private Integer code; // 状态码

    private String msg;

    private Object result; // 响应的数据
}
