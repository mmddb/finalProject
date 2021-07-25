package com.jon.api.user.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor

@ApiModel
public class User {
    @ApiModelProperty(value = "The unique id of user")
    String id;
    @ApiModelProperty(value = "The name of user")
    String name;
    @ApiModelProperty(value = "The unique email of user", required = true)
    String email;
    @ApiModelProperty(value = "The telephone of user")
    String telephone;
    @ApiModelProperty(value = "The password of user", required = true)
    String password;
    @ApiModelProperty(value = "The type of user (CLIENT or DRIVER)", required = true)
    String type;
}
