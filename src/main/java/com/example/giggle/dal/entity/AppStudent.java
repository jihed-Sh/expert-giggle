package com.example.giggle.dal.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Data
@Entity
@Table(name = "Student")
@ToString(callSuper = true)
public class AppStudent {

    @Column(name = "student_id")
    @Id
    private String id;

    private String firstName;

    private String lastName;

    private LocalDateTime dateOfBirth;

    @OneToOne
    @JoinColumn(name = "classroom_id")
    private AppClassroom classroom;  /*(Many-to-Many Relationship)*/

    @OneToOne
    @JoinColumn(name = "contact_id")
    private AppContact contact;  /*(Many-to-Many Relationship)*/

    @OneToOne
    @JoinColumn(name = "department_id")
    private AppDepartment enrolledDepartment;

    @OneToMany
    @JoinColumn(name = "announcement_id")
    private List<AppAnnouncement> announcements;/*(Many-to-Many Relationship)*/


}
