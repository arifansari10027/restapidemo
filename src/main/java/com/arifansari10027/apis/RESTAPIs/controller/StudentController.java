package com.arifansari10027.apis.RESTAPIs.controller;

import com.arifansari10027.apis.RESTAPIs.dto.StudentDto;
import com.arifansari10027.apis.RESTAPIs.entity.Student;
import com.arifansari10027.apis.RESTAPIs.repository.Studentrepo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // This annotation is made up from Response body and controller annotations. It returns the output in JSON Format
public class StudentController {

    private final Studentrepo studentrepo;

    public StudentController(Studentrepo studentrepo) {
        this.studentrepo = studentrepo;
    }
 
//  Creating APIs
    // @GetMapping("/student")
    // public StudentDto getStudent() {
    //     return new StudentDto(101, "Arif", "BCA", "Male", "arif@google.com");
    // }

    // This will return all list of students
    @GetMapping("/student")
    public List<Student> getAllStudents() {
        return studentrepo.findAll();
    }
    

    @GetMapping("/student/{id}")
    public StudentDto getStudentId() {
        return new StudentDto(102, "Ansari", "BBA", "Male", "ansari@x.com");
    }
}
