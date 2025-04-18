package com.lk.kp.mentalhospital.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Program implements SuperEntity {
    private String programID;
    private String therapistID;
    private String name;
    private String duration;
    private double fee;
}

