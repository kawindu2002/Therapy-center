package com.lk.kp.mentalhospital.dto.tm;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PatientTM {
    private String patientID;
    private String name;
    private String address;
    private String contact;
    private Date regDate;
    private String state;

}

