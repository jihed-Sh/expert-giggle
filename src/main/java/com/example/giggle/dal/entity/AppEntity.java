package com.example.giggle.dal.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document("Entity")
@ToString(callSuper = true)
public class AppEntity {
    private String id;
    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private AppContact contactInformation;

}
