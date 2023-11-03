package com.example.giggle.dal.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Contact")
@ToString(callSuper = true)
public class AppContact {
    private String emailAddress;
    private String secondEmailAddress;
    private String phoneNumber;
    private String secondPhoneNumber;

}
