package org.example.service;

import org.example.entity.StudentEntity;
import org.example.model.Student;

import java.util.List;

public interface StudentService {

    StudentEntity persist(Student student);

    List<Student> getAllStudent();

    void updateCustomer(Student student);

    void deleteStudent(Integer id);

    Student getStudent(Integer id);
}
