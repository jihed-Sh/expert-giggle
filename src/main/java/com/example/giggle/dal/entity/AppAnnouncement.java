//package com.example.giggle.dal.entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.Data;
//import lombok.Getter;
//import lombok.ToString;
//
//import java.time.LocalDateTime;
//import java.util.List;
//@Data
//@Entity
//@Table(name = "Announcement")
//@ToString(callSuper = true)
//public class AppAnnouncement {
//    @Getter
//    @Id
//    private String id;
//    private String title;
//    private String content;
//    private LocalDateTime datePosted;
//    //TODO change it to ref
//    private AppTeacher author; /*(Foreign Key, could be a teacher or administrator)*/
//    private List<AppDepartment> associatedDepartments; /*(Many-to-Many Relationship, for targeted announcements)*/
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    //image
//    //pdf
//
//}
