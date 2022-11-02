//
//
//import com.demo.entity.Blog;
//import com.demo.mapper.BlogMapper;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import utils.MybatisUtils;
//
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class BlogMapperTest {
//    @Autowired
//    private BlogMapper blogMapper;
//
//   // @Test
//    public void addBlog() {
//        // SqlSession sqlSession = MybatisUtils.getSqlSession();
//
//
//        Blog blog = new Blog(118074003, "【Mybatis】Mybatis入门", "牧心.", " 2021-06-20 20:03:04", 172, "MyBatis", 1, 1);
//        Blog blog2 = new Blog(118074590, "【Mybatis】一个Mybatis程序", "牧心.", "2021-06-22 21:03:03", 129, "MyBatis", 1, 1);
//        Blog blog3 = new Blog(118311033, "【Mybatis】增删改查的实现", "牧心.", "2021-06-28 20:20:29", 108, "MyBatis", 2, 1);
//        Blog blog4 = new Blog(118343512, "【Mybatis】Map传参和模糊查询", "牧心.", "2021-06-29 21:22:36", 11, "MyBatis", 1, 1);
//        Blog blog5 = new Blog(118344763, "【Mybatis】配置之属性优化", "牧心.", "2021-06-29 21:59:54", 21, "MyBatis", 1, 1);
//
//        blogMapper.addBlog(blog);
//        blogMapper.addBlog(blog2);
//        blogMapper.addBlog(blog3);
//        blogMapper.addBlog(blog4);
//        //blogMapper.addBlog()
//    }
//
////        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
////        mapper.addBlog(blog);
////        mapper.addBlog(blog2);
////        mapper.addBlog(blog3);
////        mapper.addBlog(blog4);
////        mapper.addBlog(blog5);
////
////        sqlSession.commit();
////
////        sqlSession.close();
//
//
////    @Test
////    public void getBlogList(){
////        SqlSession sqlSession = MybatisUtils.getSqlSession();
////        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
////
////        List<Blog> blogs = mapper.getBlogList();
////        for (Blog blog : blogs) {
////            System.out.println(blog);
////        }
////
////        sqlSession.close();
////    }
////
////    @Test
////    public void getVisibleBlogListByLabel(){
////        SqlSession sqlSession = MybatisUtils.getSqlSession();
////        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
////
////        List<Blog> blogs = mapper.getVisibleBlogListByLabel("");
////        for (Blog blog : blogs) {
////            System.out.println(blog);
////        }
////
////        sqlSession.close();
////    }
////
////    @Test
////    public void getVisibleBlogListByLabelAndTitle(){
////        SqlSession sqlSession = MybatisUtils.getSqlSession();
////        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
////
////        Map<String, Object> map = new HashMap<String, Object>();
//////        map.put("label", "Spring");
////        map.put("title", "%AOP%");
////        List<Blog> blogs = mapper.getBlogListByLabelAndTitle(map);
////        for (Blog blog : blogs) {
////            System.out.println(blog);
////        }
////
////        sqlSession.close();
////    }
////
////    @Test
////    public void getVisibleBlogListByLabelAndTitle2(){
////        SqlSession sqlSession = MybatisUtils.getSqlSession();
////        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
////
////        Map<String, Object> map = new HashMap<String, Object>();
////        map.put("label", "MyBatis");
//////        map.put("title", "%AOP%");
////        List<Blog> blogs = mapper.getBlogListByLabelAndTitle2(map);
////        for (Blog blog : blogs) {
////            System.out.println(blog);
////        }
////
////        sqlSession.close();
////    }
////
////    @Test
////    public void getVisibleBlogListByLabelAndTitle3(){
////        SqlSession sqlSession = MybatisUtils.getSqlSession();
////        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
////
////        Map<String, Object> map = new HashMap<String, Object>();
//////        map.put("label", "Spring");
////        map.put("title", "%AOP%");
////        List<Blog> blogs = mapper.getBlogListByLabelAndTitle3(map);
////        for (Blog blog : blogs) {
////            System.out.println(blog);
////        }
////
////        sqlSession.close();
////    }
////
////    @Test
////    public void updateBlogById(){
////        SqlSession sqlSession = MybatisUtils.getSqlSession();
////        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
////
////        Map<String, Object> map = new HashMap<String, Object>();
////        map.put("id", 116502734);
////        map.put("title", "【Spring】DI依赖注入-new");
////        map.put("visible", 0);
////        mapper.updateBlogById(map);
////        sqlSession.commit();
////
////        sqlSession.close();
////    }
////
////    @Test
////    public void getBlogListByIds(){
////        SqlSession sqlSession = MybatisUtils.getSqlSession();
////        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
////
////        Map<String, Object> map = new HashMap<String, Object>();
////        ArrayList<Integer> ids = new ArrayList<Integer>();
////        ids.add(116012859);
////        ids.add(118058442);
////        ids.add(117374430);
////        map.put("ids", ids);
////
////        List<Blog> blogs = mapper.getBlogListByIds(map);
////        for (Blog blog : blogs) {
////            System.out.println(blog);
////        }
////
////        sqlSession.close();
////    }
////
////    @Test
////    public void getBlogListByTitleOrLabel(){
////        SqlSession sqlSession = MybatisUtils.getSqlSession();
////        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
////
////        Map<String, Object> map = new HashMap<String, Object>();
//////        map.put("label", "Spring");
//////        map.put("title", "%AOP%");
////        map.put("visible", 0);
////        List<Blog> blogs = mapper.getBlogListByTitleOrLabel(map);
////        for (Blog blog : blogs) {
////            System.out.println(blog);
////        }
////
////        sqlSession.close();
////    }
//}