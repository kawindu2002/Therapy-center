package com.lk.kp.mentalhospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Data
@Entity
@Table(name = "patient")
public class Patient implements SuperEntity{
    @Id
    @Column(name = "patient_id")
    private String patientID;

    private String firstName;
    private String lastName;
    private String contact;
    private String address;
    private String gender;

}


