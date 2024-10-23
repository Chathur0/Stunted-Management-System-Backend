package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entity.StudentEntity;
import org.example.model.Student;
import org.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Student> getAllStudent() {
        Iterable<StudentEntity> all = studentRepository.findAll();
        List<Student> allStudent = new ArrayList<>();
        all.forEach(studentEntity -> allStudent.add(
                mapper.convertValue(studentEntity, Student.class)
        ));
        return allStudent;
    }

    @Override
    public void updateCustomer(Student student) {
        StudentEntity save = studentRepository.save(
                mapper.convertValue(student, StudentEntity.class)
        );
        System.out.println(save);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}
