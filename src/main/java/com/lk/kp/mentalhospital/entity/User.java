package com.lk.kp.mentalhospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Data
@Entity
@Table(name = "user")
public class User implements SuperEntity {
    @Id
    @Column(name = "user_id")
    private String userID;

    private String name;
    private String password;
    private String role;

}


