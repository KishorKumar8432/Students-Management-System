package com.StudentsManagementSystem.controller;

import com.StudentsManagementSystem.entity.Student;
import com.StudentsManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.service.annotation.GetExchange;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private StudentService service;

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/students")
    public String getAllStudents(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "students";
    }
    @GetMapping("/students/new")
    public String createStudentForm(Model model){
       Student student = new Student();
       model.addAttribute("student",student);

        return "create-student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student")  Student student){
         service.saveStudent(student);
         return "redirect:/students";
    }


}
