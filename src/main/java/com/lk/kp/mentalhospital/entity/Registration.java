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
@Table(name = "registration")

public class Registration implements SuperEntity {
    @Id
    @Column(name = "registration_id")
    private String registrationID;

    private String patientID;
    private String programID;
    private Date date;

}
