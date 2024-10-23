package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.model.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}