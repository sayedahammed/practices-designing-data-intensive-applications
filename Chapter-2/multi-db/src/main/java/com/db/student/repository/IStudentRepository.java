package com.db.student.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.db.student.entity.Student;

public interface IStudentRepository extends MongoRepository<Student, Long> {
    
}
