package com.db.student.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.student.entity.Student;
import com.db.student.service.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String test() {
        return "Postgres Controller is working!";
    }

    @GetMapping("/list")
    public Iterable<Student> getAll() {
        return studentService.getAllStudents();
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
}
