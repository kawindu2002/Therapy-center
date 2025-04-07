package com.lk.kp.mentalhospital.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ProgramDTO {
    private String programID;
    private String therapistID;
    private String name;
    private String duration;
    private double fee;
}

