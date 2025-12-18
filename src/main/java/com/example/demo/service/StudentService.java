package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.StudentEntity;

public interface StudentService {
    
    StudentEntity addStudent(StudentEntity stu);
    List<StudentEntity> getAllStudents();
    StudentEntity updateStudent(Long id,StudentEntity stu );
    void deleteStudent(Long id);
    StudentEntity getStudentById(Long id);

}
