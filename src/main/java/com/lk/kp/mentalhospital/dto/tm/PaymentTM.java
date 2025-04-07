package com.lk.kp.mentalhospital.dto.tm;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PaymentTM {
    private String paymentID;
    private String patientID;
    private double price;
    private Date paymentDate;
    private String method;
    private String status;

}
