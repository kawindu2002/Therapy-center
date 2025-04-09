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
    private String firstName;
    private String lastName;
    private String contact;
    private String address;
    private String gender;

}

