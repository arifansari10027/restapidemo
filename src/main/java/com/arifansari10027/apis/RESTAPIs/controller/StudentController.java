package com.arifansari10027.apis.RESTAPIs.controller;

import com.arifansari10027.apis.RESTAPIs.dto.AddStudentRequestDto;
import com.arifansari10027.apis.RESTAPIs.dto.StudentDto;
import com.arifansari10027.apis.RESTAPIs.service.Studentservice;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController // This annotation is made up from Response body and controller annotations. It returns the output in JSON Format
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final Studentservice studentservice;

    // public StudentController(Studentrepo studentrepo) {
    //     this.studentrepo = studentrepo;
    // }
 
//  Creating APIs
    // @GetMapping("/student")
    // public StudentDto getStudent() {
    //     return new StudentDto(101, "Arif", "BCA", "Male", "arif@google.com");
    // }

    // This will return all list of students
    @GetMapping
    public List<StudentDto> getAllStudents() {
        return studentservice.getAllStudents();
    }
    

    @GetMapping("/{id}")
    public StudentDto getStudentId(@PathVariable int id) {
        return studentservice.getStudentById(id);
    }

    // For post function
    @PostMapping("")
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody AddStudentRequestDto addStudentRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentservice.createNewStudent(addStudentRequestDto));
    }   

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id) {
        studentservice.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }
}
