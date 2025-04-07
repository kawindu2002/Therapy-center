package com.lk.kp.mentalhospital.dto.tm;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class UserTM {
    private String userID;
    private String name;
    private String password;
    private String role;
    private Date regDate;
    private String state;

}
