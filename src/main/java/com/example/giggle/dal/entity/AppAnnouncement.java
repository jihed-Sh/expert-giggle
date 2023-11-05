package com.example.giggle.dal.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;
@Data
@Entity
@Table(name = "Announcement")
@ToString(callSuper = true)
public class AppAnnouncement {
    @Column(name = "announcement_id")
    @Getter
    @Id
    private String id;
    private String title;
    private String content;
    private LocalDateTime datePosted;
    @OneToOne
    @JoinColumn(name = "teacher_id")
    private AppTeacher author; /*(Foreign Key, could be a teacher or administrator)*/
    @OneToMany
    @JoinColumn(name = "department_id")
    private List<AppDepartment> associatedDepartments; /*(Many-to-Many Relationship, for targeted announcements)*/

    //image
    //pdf

}
