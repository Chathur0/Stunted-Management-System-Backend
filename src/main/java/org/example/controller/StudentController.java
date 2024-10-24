package org.example.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.StudentEntity;
import org.example.model.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    ObjectMapper mapper;

    @PostMapping("/student")
    public StudentEntity persist(@RequestBody Student student) {
        return studentService.persist(student);
    }

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @PutMapping("/student")
    public void updateStudent(@RequestBody Student student){
        studentService.updateCustomer(student);
    }
    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentService.getStudent(id);
    }

}
