package com.lk.kp.mentalhospital.dto.tm;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class TherapySessionTM {
    private String sessionID;
    private String patientID;
    private String therapistID;
    private String programID;
    private Date date;
    private String duration;
    private Double cost;
    private String paymentState;

}

