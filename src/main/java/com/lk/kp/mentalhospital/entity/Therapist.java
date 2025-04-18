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
@Table(name = "therapist")

public class Therapist implements SuperEntity {
    @Id
    @Column(name = "therapist_id")
    private String therapistID;

    private String name;
    private String programID;
    private String contact;
    private String specification;
}

