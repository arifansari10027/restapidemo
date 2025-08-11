// It implements the methods defined in the Studentservice interface

package com.arifansari10027.apis.RESTAPIs.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.arifansari10027.apis.RESTAPIs.dto.AddStudentRequestDto;
import com.arifansari10027.apis.RESTAPIs.dto.StudentDto;
import com.arifansari10027.apis.RESTAPIs.entity.Student;
import com.arifansari10027.apis.RESTAPIs.repository.Studentrepo;
import com.arifansari10027.apis.RESTAPIs.service.Studentservice;

import lombok.RequiredArgsConstructor;

@Service // This indicates that this class is a service component in the Spring context
@RequiredArgsConstructor // It automatically generates a constructor with required arguments
public class StudentImpl implements Studentservice {

    private final Studentrepo studentrepo;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentrepo.findAll();
        return students
                .stream()
                .map(student -> new StudentDto(
                        student.getId(),
                        student.getName(),
                        student.getCourse(),
                        student.getGender(),
                        student.getEmail()))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto getStudentById(int id) {
        Student student =  studentrepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found"));
        StudentDto studentDto = modelMapper.map(student, StudentDto.class);
        return studentDto;
    }

    @Override
    public StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto) {
        Student newStudent = modelMapper.map(addStudentRequestDto, Student.class);
        Student student = studentrepo.save(newStudent);
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public void deleteStudentById(int id) {
        if (!studentrepo.existsById(id)) {
            throw new IllegalArgumentException("Student not found" + id);
        }
        studentrepo.deleteById(id);
    }

    @Override
    public StudentDto updateStudent(int id, AddStudentRequestDto addStudentRequestDto) {
                Student student =  studentrepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found"));
                modelMapper.map(addStudentRequestDto, student);
                student = studentrepo.save(student);
                return modelMapper.map(student, StudentDto.class);
    }

   

    

}