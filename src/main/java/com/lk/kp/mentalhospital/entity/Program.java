package com.lk.kp.mentalhospital.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Program {
    private String programID;
    private String therapistID;
    private String name;
    private String duration;
    private double fee;
}

