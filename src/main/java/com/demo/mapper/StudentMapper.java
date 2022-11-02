package com.demo.mapper;

import com.demo.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
    int insert(Student student);
}