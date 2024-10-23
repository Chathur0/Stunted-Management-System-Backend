package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entity.StudentEntity;
import org.example.model.Student;
import org.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void persist(Student student) {
        StudentEntity save = studentRepository.save(
                mapper.convertValue(student, StudentEntity.class)
        );
        System.out.println(save);
    }
}
