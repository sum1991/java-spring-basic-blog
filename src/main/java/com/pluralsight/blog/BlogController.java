package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BlogController {


    private PostRepository postRepository;
    public BlogController(PostRepository ps){
        postRepository = ps;
    }
    @RequestMapping("/")
    public String listPosts(ModelMap mm){
        List<Post> lp = postRepository.getAllPosts();
        mm.put("posts",lp);
        return "home";
    }
}
