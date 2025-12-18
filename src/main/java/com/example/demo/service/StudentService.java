package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.StudentEntity;

public interface StudentService {
    
    StudentEntity addStudent(StudentEntity stu);
    List<StudentEntity> getAllStudents();
    StudentEntity updateStudent(int id,StudentEntity stu );
    void deleteStudent(int id);
    StudentEntity getStudentById(int id);

}
