package com.lk.kp.mentalhospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Data
@Entity
@Table(name = "payment")

public class Payment implements SuperEntity{
    @Id
    @Column(name = "payment_id")
    private String paymentID;

    private String registrationID;
    private String therapysessionID;
    private double price;
    private Date paymentDate;
    private String method;

}
