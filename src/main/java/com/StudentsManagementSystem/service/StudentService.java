package com.StudentsManagementSystem.service;

import com.StudentsManagementSystem.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();

    public Student saveStudent(Student student);

}
