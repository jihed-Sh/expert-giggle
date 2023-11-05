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
    @JoinColumn(name = "department_id")
    private AppDepartment department;

    @OneToOne
    @JoinColumn(name = "contact_id")
    private AppContact contact;

    @OneToMany
    @JoinColumn(name = "classroom_id")
    private List<AppClassroom> assignedClassrooms; /*(Many-to-Many Relationship)*/

    @OneToMany
    @JoinColumn(name = "announcement_id")
    private List<AppAnnouncement> announcements; /*(Many-to-Many Relationship)*/
}
