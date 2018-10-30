package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.Post;
import in.deepanshutyagi.chemistry.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping({"/", ""})
    public Post addPost(@Valid Post post){
        return postService.createPost(post);
    }

    @GetMapping({"/", ""})
    public List<Post> getAllPosts(){
        return postService.getPosts();
    }

    @GetMapping("/{id}")
    public Post getPostByID(@PathVariable Long id){
        return postService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deletePostByID(@PathVariable Long id){
        postService.deletePost(id);
        return "Deleted Successfully";
    }

}
