package com.lk.kp.mentalhospital.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User implements SuperEntity {
    private String userID;
    private String name;
    private String password;
    private String role;

}
