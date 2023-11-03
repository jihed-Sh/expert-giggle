package com.example.giggle.dal.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document("Teacher")
@ToString(callSuper = true)
public class AppTeacher extends AppEntity {
    private LocalDateTime hiredDate;
    //TODO change it to ref
    private List<AppClassroom> assignedClassrooms; /*(Many-to-Many Relationship)*/
    //TODO change it to ref
    private List<AppAnnouncement> announcements; /*(Many-to-Many Relationship)*/
    //TODO change it to ref
    private AppDepartment department;
}
