package com.arifansari10027.apis.RESTAPIs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddStudentRequestDto  {
private String Name;
private String Course;
private String Gender;
private String email;
}