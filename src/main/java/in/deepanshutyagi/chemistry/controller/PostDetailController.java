package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.PostDetail;
import in.deepanshutyagi.chemistry.service.PostDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/postDetail")
public class PostDetailController {
    @Autowired
    PostDetailService postDetailService;

    @PostMapping({"/", ""})
    public PostDetail addPostDetail(@Valid PostDetail postDetail){
        return postDetailService.createPostDetail(postDetail);
    }

    @GetMapping({"/", ""})
    public List<PostDetail> getAllPostDetails(){
        return postDetailService.getPostDetails();
    }

    @GetMapping("/{id}")
    public PostDetail getPostDetailByID(@PathVariable Long id){
        return postDetailService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deletePostDetailByID(@PathVariable Long id){
        postDetailService.deletePostDetail(id);
        return "Deleted Successfully";
    }

}
