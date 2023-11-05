package com.example.giggle.dal.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "Teacher")
@ToString(callSuper = true)
public class AppTeacher {
    @Column(name = "teacher_id")
    @Getter
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private LocalDateTime hiredDate;
    @OneToOne
    @JoinColumn(name = "department_id", nullable = false)
    private AppDepartment department;
    //TODO change it to ref
    //private List<AppClassroom> assignedClassrooms; /*(Many-to-Many Relationship)*/
    //TODO change it to ref
    //private List<AppAnnouncement> announcements; /*(Many-to-Many Relationship)*/
    //TODO change it to ref
    //    private AppContact contactInformation;


}
