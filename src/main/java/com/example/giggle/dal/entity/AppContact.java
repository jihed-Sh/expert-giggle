package com.example.giggle.dal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "Contact")
@ToString(callSuper = true)
public class AppContact {
    @Id
    private String id;
    private String emailAddress;
    private String secondEmailAddress;
    private String phoneNumber;
    private String secondPhoneNumber;

}
