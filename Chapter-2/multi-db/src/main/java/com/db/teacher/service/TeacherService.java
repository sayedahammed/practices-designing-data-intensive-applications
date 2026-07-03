package com.db.teacher.service;

import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.db.teacher.entity.Teacher;
import com.db.teacher.repository.ITeacherRepository;

@Service
public class TeacherService {
    private final ITeacherRepository teacherRepository;

    public TeacherService(ITeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Iterator<Teacher> getAllTeachers() {
        return teacherRepository.findAll().iterator();
    }
    
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
