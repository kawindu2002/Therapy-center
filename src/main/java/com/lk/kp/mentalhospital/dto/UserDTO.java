package com.lk.kp.mentalhospital.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class UserDTO {
    private String userID;
    private String name;
    private String password;
    private String role;

}
