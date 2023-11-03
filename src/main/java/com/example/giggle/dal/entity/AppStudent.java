package com.example.giggle.dal.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document("Student")
@ToString(callSuper = true)
public class AppStudent extends  AppEntity {
    private List<AppClassroom> classrooms;  /*(Many-to-Many Relationship)*/
    //TODO change it to ref
    private List<AppAnnouncement> announcements;/*(Many-to-Many Relationship)*/
    //TODO change it to ref
    private AppDepartment enrolledDepartment;

}
