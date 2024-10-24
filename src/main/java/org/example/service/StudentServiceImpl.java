package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entity.StudentEntity;
import org.example.model.Student;
import org.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public StudentEntity persist(Student student) {
        return studentRepository.save(
                mapper.convertValue(student, StudentEntity.class)
        );
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student> allStudent = new ArrayList<>();
        studentRepository.findAll().forEach(studentEntity -> allStudent.add(
                mapper.convertValue(studentEntity, Student.class)
        ));
        return allStudent;
    }

    @Override
    public void updateCustomer(Student student) {
        studentRepository.save(
                mapper.convertValue(student, StudentEntity.class)
        );
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student getStudent(Integer id) {
        return mapper.convertValue(
                studentRepository.findById(id),
                Student.class
        );
    }
}
