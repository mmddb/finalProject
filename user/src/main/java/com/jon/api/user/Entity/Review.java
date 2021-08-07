package com.jon.api.user.Entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class Review {

    private int id;
    private int clientId;
    private int driverId;
    private int star;
    private String comment;
    private int orderId;
    private String date;
}
