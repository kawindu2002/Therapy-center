package com.lk.kp.mentalhospital.dto;

import lombok.*;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class RegistrationDTO {
    private String registrationID;
    private String patientID;
    private String programID;
    private Date date;
    private String state;

}

