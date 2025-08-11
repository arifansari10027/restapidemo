// This file will contain all the necessary info of student

package com.arifansari10027.apis.RESTAPIs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
    private int id;
    private String Name;
    private String Course;
    private String Gender;
    private String email;

//    This whole getter, setter and constructors can be skipped with  @Data
//    public StudentDto(int id, String name, String course, String gender, String email) {
//        this.id = id;
//        Name = name;
//        Course = course;
//        Gender = gender;
//        this.email = email;
//    }
//
//    public StudentDto() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String name) {
//        Name = name;
//    }
//
//    public String getCourse() {
//        return Course;
//    }
//
//    public void setCourse(String course) {
//        Course = course;
//    }
//
//    public String getGender() {
//        return Gender;
//    }
//
//    public void setGender(String gender) {
//        Gender = gender;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
}
