package com.demo.service;

import com.demo.entity.Student;
import com.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("student")
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;
    public Student insert(Student student){
        int insert = studentMapper.insert(student);
        return student;
    }
}
