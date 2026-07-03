package com.db.student.service;

import org.springframework.stereotype.Service;

import com.db.student.entity.Student;
import com.db.student.repository.IStudentRepository;

@Service
public class StudentService {
    private final IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student deleteStudent(Long id) {
        Student student = getStudentById(id);
        if (student != null) {
            studentRepository.deleteById(id);
        }
        return student;
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        return studentRepository.findById(id)
                .map(student -> {
                    student.setName(updatedStudent.getName());
                    student.setEmail(updatedStudent.getEmail());
                    return studentRepository.save(student);
                })
                .orElse(null);
    }
}
