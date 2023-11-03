package com.example.giggle.dal.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
@Data
@Document("Announcement")
@ToString(callSuper = true)
public class AppAnnouncement {
    private String id;
    private String title;
    private String content;
    private LocalDateTime datePosted;
    //TODO change it to ref
    private AppTeacher author; /*(Foreign Key, could be a teacher or administrator)*/
    private List<AppDepartment> associatedDepartments; /*(Many-to-Many Relationship, for targeted announcements)*/
    //image
    //pdf

}
