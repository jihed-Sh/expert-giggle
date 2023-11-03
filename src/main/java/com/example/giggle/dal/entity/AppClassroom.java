package com.example.giggle.dal.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("Classrooom")
@ToString(callSuper = true)
public class AppClassroom {
    private String id;
    private String name;
    ///TODO  make annotation here to make it max 40;
    private int capacity;
    //TODO change it to ref
    private AppDepartment department;
    private List<AppStudent> students;/*(Many-to-Many Relationship)*/
    private List<AppTeacher> teachers;/*(Many-to-Many Relationship)*/

}
