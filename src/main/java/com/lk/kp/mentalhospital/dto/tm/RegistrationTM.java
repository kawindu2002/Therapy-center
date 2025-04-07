package com.lk.kp.mentalhospital.dto.tm;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class RegistrationTM {
    private String registrationID;
    private String patientID;
    private String programID;
    private Date date;
    private String state;

}

