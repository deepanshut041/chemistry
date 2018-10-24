package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Post;
import in.deepanshutyagi.chemistry.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("postService")
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository postRepository;

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post getById(Long id) {
        Optional<Post> post = postRepository.findById(id);
        if (post.isPresent()){
            return post.get();
        }
        return null;
    }

    @Override
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
