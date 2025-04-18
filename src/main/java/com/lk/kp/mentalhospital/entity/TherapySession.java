package com.lk.kp.mentalhospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Data
@Entity
@Table(name = "therapy_session")

public class TherapySession implements SuperEntity {
    @Id
    @Column(name = "session_id")
    private String sessionID;

    private String patientID;
    private String therapistID;
    private String programID;
    private Date date;
    private String duration;
    private Double cost;
    private String paymentState;

}

