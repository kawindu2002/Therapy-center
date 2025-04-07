package com.lk.kp.mentalhospital.dto;

import lombok.*;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class AppointmentDTO {
    private String appointmentID;
    private String patientID;
    private String therapistID;
    private String programID;
    private Date paymentDate;
    private Time time;
    private String state;

}

