package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Comment comment);
    List<Comment> getComments();
    Comment getById(Long id);
    void deleteComment(Long id);
}
