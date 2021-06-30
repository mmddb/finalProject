package com.jon.api.client.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    String id;
    String name;
    String email;
    String telephone;
    String password;
}
