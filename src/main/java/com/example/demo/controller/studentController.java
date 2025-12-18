package com.example.studentCrud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.studentCrud.entity.StudentEntity;
import com.example.studentCrud.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    // constructor injection
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // CREATE
    @PostMapping
    public StudentEntity addStudent(@RequestBody StudentEntity student) {
        return studentService.addStudent(student);
    }

    // READ ALL
    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public StudentEntity updateStudent(
            @PathVariable int id,
            @RequestBody StudentEntity student) {
        return studentService.updateStudent(id, student);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "Student deleted successfully";
    }
}