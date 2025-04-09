package com.lk.kp.mentalhospital.entity;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Registration {
    private String registrationID;
    private String patientID;
    private String programID;
    private Date date;

}

