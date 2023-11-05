package com.example.giggle.dal.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;


import java.util.List;

@Getter
@Data
@Entity
@Table(name = "Department")
@ToString(callSuper = true)
public class AppDepartment {

    @Id
    private String id;
    private String departmentName;
    private String description;
    @OneToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private AppTeacher head;
    @OneToMany
    @JoinColumn(name = "teacher_id", nullable = false)
    private List<AppTeacher> teachers;/*many to many*/
    @OneToMany
    @JoinColumn(name = "stuedent_id", nullable = false)
    private List<AppStudent> students;/*many to many*/
    @OneToMany
    @JoinColumn(name = "classroom_id", nullable = false)
    private List<AppClassroom> classrooms;/*many to many*/

}
