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
@Table(name = "program")
public class Program implements SuperEntity {
    @Id
    @Column(name = "program_id")
    private String programID;

    private String therapistID;
    private String name;
    private String duration;
    private double fee;
}
