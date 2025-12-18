package com.example.demo.service;

import java.util.List;



import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public StudentEntity addStudent(StudentEntity student) {
        return studentRepo.save(student);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public StudentEntity updateStudent(Long id, StudentEntity student) {
        student.setId(id); // important
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }

    @Override
    public StudentEntity getStudentById(Long id) {
    return studentRepo.findById(id)
            .orElseThrow(() ->
                new StudentNotFoundException("Student not found with id: " + id)
            );
}
}