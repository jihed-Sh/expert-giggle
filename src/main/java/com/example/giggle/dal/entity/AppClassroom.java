package com.example.giggle.dal.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@Table(name = "Classrooom")
@ToString(callSuper = true)
public class AppClassroom {
    @Column(name = "classroom_id")
    @Id
    private String id;

    private String name;

    ///TODO  make annotation here to make it max 40;
    private int capacity;

    @OneToOne
    @JoinColumn(name = "department_id")
    private AppDepartment department;

    @OneToMany
    @JoinColumn(name = "student_id")
    private List<AppStudent> students;/*(Many-to-Many Relationship)*/

    @OneToMany
    @JoinColumn(name = "teacher_id")
    private List<AppTeacher> teachers;/*(Many-to-Many Relationship)*/
}
