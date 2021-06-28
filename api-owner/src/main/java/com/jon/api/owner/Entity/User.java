package com.jon.api.owner.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    Integer id;
    String name;
    String email;
    String telephone;
    String password;
}
