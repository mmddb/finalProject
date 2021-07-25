package com.jon.email.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel
public class Order {
    @ApiModelProperty(value = "Unique id of order")
    private String orderId;
    @ApiModelProperty(value = "Unique id of client")
    private String clientId;

    @ApiModelProperty(value = "start address of the transport")
    private String startAddress;
    @ApiModelProperty(value = "destination of the transport")
    private String endAddress;
    @ApiModelProperty(value = "postcode of start address")
    private String sPostcode;
    @ApiModelProperty(value = "postcode of end address")
    private String ePostcode;

    @ApiModelProperty(value = "Start city of the order")
    private String city;

    @ApiModelProperty(value = "Description of cargo")
    private String cargoInfo;
    @ApiModelProperty(value = "Cargo's type (Furniture, Instrument, Grocery ...)")
    private String cargoType;

    @ApiModelProperty(value = "Prefer transport date")
    private String date;
    @ApiModelProperty(value = "prefer transport time")
    private String time;

    @ApiModelProperty(value = "Unique id of driver")
    private String driverId;
    @ApiModelProperty(value = "Order's status (PUBLISHED, FETCHED, TRANSPORTED, COMPLETED)")
    private OrderStatus status = OrderStatus.PUBLISHED;
    @ApiModelProperty(value = "Contact number of client")
    private String telephone;

    @Override
    public String toString() {
        return "Order Details: \n" +
                "orderId='" + orderId + '\'' +
                ", clientId='" + clientId + '\'' +
                ", startAddress='" + startAddress + '\'' +
                ", sPostcode='" + sPostcode + '\'' +
                ", endAddress='" + endAddress + '\'' +
                ", ePostcode='" + ePostcode + '\'' +
                ", startcity='" + city + '\'' +
                ", cargoInfo='" + cargoInfo + '\'' +
                ", cargoType='" + cargoType + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", driverId='" + driverId + '\'' +
                ", status=" + status +
                ", telephone='" + telephone;
    }
}
