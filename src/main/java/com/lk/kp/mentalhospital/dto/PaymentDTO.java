package com.lk.kp.mentalhospital.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PaymentDTO {
    private String paymentID;
    private String registrationID;
    private String therapysessionID;
    private double price;
    private Date paymentDate;
    private String method;

}

