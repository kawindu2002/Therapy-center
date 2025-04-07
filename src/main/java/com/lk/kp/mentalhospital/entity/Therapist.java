package com.lk.kp.mentalhospital.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Therapist {
    private String therapistID;
    private String programID;
    private String name;
    private String contact;
    private String specification;
}

