package com.lk.kp.mentalhospital.entity;

import lombok.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Payment {
    private String paymentID;
    private String registrationID;
    private String therapysessionID;
    private double price;
    private Date paymentDate;
    private String method;

}

