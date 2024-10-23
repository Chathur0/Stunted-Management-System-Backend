package org.example.service;

import org.example.model.Student;

import java.util.List;

public interface StudentService {

    void persist(Student student);

    List<Student> getAllStudent();

    void updateCustomer(Student student);

    void deleteStudent(Integer id);
}
