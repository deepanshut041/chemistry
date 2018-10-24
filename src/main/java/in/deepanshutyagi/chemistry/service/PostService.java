package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Post;

import java.util.List;

public interface PostService {
    Post createPost(Post post);
    List<Post> getPosts();
    Post getById(Long id);
    void deletePost(Long id);
}
