package com.lk.kp.mentalhospital.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Therapist implements SuperEntity {
    private String therapistID;
    private String name;
    private String programID;
    private String contact;
    private String specification;
}


