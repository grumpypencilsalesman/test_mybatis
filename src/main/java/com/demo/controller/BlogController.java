package com.demo.controller;

import com.demo.entity.Blog;
import com.demo.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot2")
public class BlogController {
    @Autowired
    private BlogMapper blogMapper;
//    private int id;
//    private String title;
//    private String author;
//    private String time;
//    private int read_count;
//    private String label;
//    private int like;
//    private int visible;
    //http://localhost:8080/testBoot2/insert2?sNo=222&sName=dd&sAge=1
    @RequestMapping(value="/insert2",method= RequestMethod.POST)
    public int addBlog(Blog blog){
        int i = blogMapper.addBlog(blog);
        return i;
    }
}
