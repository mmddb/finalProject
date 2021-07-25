package com.jon.order.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.sql.Date;

@ApiModel
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Quote {

    @ApiModelProperty(value = "Unique id of the quote")
    private String quoteId;

    @ApiModelProperty(value = "Unique id of order")
    private String orderId;

    @ApiModelProperty(value = "Quote date")
    private Date createdate;

    @ApiModelProperty(value = "Unique id of driver")
    private String driverId;

    @ApiModelProperty(value = "Driver's quote for this order")
    private int quote;


}
