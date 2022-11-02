package com.demo.mapper;



import com.demo.entity.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface BlogMapper {
    // insert blog
    int addBlog(Blog blog);

    // select all blogs
    List<Blog> getBlogList();

    // select visible blogs by label
    List<Blog> getVisibleBlogListByLabel(String label);

    // select blogs by label and title <if>
    List<Blog> getBlogListByLabelAndTitle(Map<String, Object> map);

    // select blogs by label and title <where>
    List<Blog> getBlogListByLabelAndTitle2(Map<String, Object> map);

    // select blogs by label and title <where>
    List<Blog> getBlogListByLabelAndTitle3(Map<String, Object> map);

    // update blog by id
    int updateBlogById(Map<String, Object> map);

    // select blogs by id-list
    List<Blog> getBlogListByIds(Map<String, Object> map);

    // select blogs / choose、when、otherwise
    List<Blog> getBlogListByTitleOrLabel(Map<String, Object> map);
}