package com.lk.kp.mentalhospital.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User {
    private String userID;
    private String name;
    private String password;
    private String role;

}
