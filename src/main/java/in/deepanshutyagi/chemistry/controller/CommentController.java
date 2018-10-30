package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.Comment;
import in.deepanshutyagi.chemistry.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping({"/", ""})
    public Comment addComment(@Valid Comment comment){
        return commentService.createComment(comment);
    }
    
    @GetMapping({"/", ""})
    public List<Comment> getAllComments(){
        return commentService.getComments();
    }

    @GetMapping("/{id}")
    public Comment getCommentByID(@PathVariable Long id){
        return commentService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCommentByID(@PathVariable Long id){
        commentService.deleteComment(id);
        return "Deleted Successfully";
    }
    
}
