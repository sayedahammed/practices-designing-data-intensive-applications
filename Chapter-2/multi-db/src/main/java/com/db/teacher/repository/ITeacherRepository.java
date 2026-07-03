package com.db.teacher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.db.teacher.entity.Teacher;

public interface ITeacherRepository extends JpaRepository<Teacher, Long> {
    
}
