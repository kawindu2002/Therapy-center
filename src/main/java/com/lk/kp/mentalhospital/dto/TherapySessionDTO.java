package com.lk.kp.mentalhospital.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class TherapySessionDTO {
    private String sessionID;
    private String patientID;
    private String therapistID;
    private String programID;
    private Date date;
    private Double cost;
    private String duration;
    private String paymentState;

}

