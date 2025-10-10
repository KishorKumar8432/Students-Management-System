package com.StudentsManagementSystem.controller;

import com.StudentsManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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


}
