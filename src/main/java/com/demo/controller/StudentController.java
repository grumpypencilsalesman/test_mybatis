package com.demo.controller;
import com.demo.entity.User;
import com.demo.service.StudentService;
import org.springframework.cglib.core.MethodWrapper;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.demo.entity.Student;
import com.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/testBoot1")
public class StudentController {
    @Autowired
    private StudentService studentService;
//    @RequestMapping("/")
//    public String index() throws Exception {
//        studentMapper.insert(new Student(1, "天宇", 24));
//        return "OK";
//    }
//插入新用户
//    http://localhost:8080/testBoot1/insert?sNo=222&sName=dd&sAge=1
//@RequestMapping(value = "/insert", method = RequestMethod.POST)
//public User insert(User user) {
//    return userService.save(user);
//}
    @RequestMapping(value="/insert",method= RequestMethod.POST)
    public Student insert(Student student){
        return studentService.insert(student);
    }

}
