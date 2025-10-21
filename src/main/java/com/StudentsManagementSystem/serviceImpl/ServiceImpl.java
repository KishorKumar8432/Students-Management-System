package com.StudentsManagementSystem.serviceImpl;

import com.StudentsManagementSystem.entity.Student;

import com.StudentsManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImpl implements StudentService {
    @Autowired
    com.StudentsManagementSystem.repository.StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudents() {

        List<Student> list = studentRepository.findAll();
        return list;
    }
}
