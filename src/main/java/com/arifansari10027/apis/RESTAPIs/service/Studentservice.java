// Writing logic for Student service for easy code separation and readability

package com.arifansari10027.apis.RESTAPIs.service;

import java.util.List;

import com.arifansari10027.apis.RESTAPIs.dto.AddStudentRequestDto;
import com.arifansari10027.apis.RESTAPIs.dto.StudentDto;

public interface Studentservice {

    List<StudentDto> getAllStudents();

    // StudentDto getStudentById(Long id);

    StudentDto getStudentById(int id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);
}