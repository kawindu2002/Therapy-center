package com.lk.kp.mentalhospital.dto.tm;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ProgramTM {
    private String programID;
    private String therapistID;
    private String name;
    private String duration;
    private double fee;
}


