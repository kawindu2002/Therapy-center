package com.lk.kp.mentalhospital.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class TherapistDTO {
    private String therapistID;
    private String name;
    private String contact;
    private String specification;
    private Date regDate;
    private String state;

}
