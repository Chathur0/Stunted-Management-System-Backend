package org.example.controller;

import lombok.extern.slf4j.Slf4j;
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

    @PostMapping("/student")
    public void persist(@RequestBody Student student) {
        studentService.persist(student);
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
}
