package com.lk.kp.mentalhospital.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class TherapistDTO {
    private String therapistID;
    private String name;
    private String programID;
    private String contact;
    private String specification;
}

