package com.jon.user.Entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class Payment {
    private int userId;
    private String recipient;
    private String sortcode;
    private String accountnumber;
}
