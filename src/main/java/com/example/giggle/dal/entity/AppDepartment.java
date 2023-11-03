package com.example.giggle.dal.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("Department")
@ToString(callSuper = true)
public class AppDepartment {

    @Id
    private String id;
    private String departmentName;
    private AppTeacher Head;
    private String description;
    //TODO change it to ref
    private List<AppTeacher> teachers;/*many to many*/
    //TODO change it to ref
    private List<AppStudent> students;/*many to many*/
    //TODO change it to ref
    private List<AppClassroom> classrooms;/*many to many*/

}
