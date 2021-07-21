package com.jon.api.client.Entity;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User {
    String id;
    String name;
    String email;
    String telephone;
    String password;
    String type;
}
