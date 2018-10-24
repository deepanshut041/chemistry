package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.PostDetail;
import in.deepanshutyagi.chemistry.repository.PostDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("postDetailService")
public class PostDetailServiceImpl implements PostDetailService{

    @Autowired
    PostDetailRepository postDetailRepository;

    @Override
    public PostDetail createPostDetail(PostDetail postDetail) {
        return postDetailRepository.save(postDetail);
    }

    @Override
    public List<PostDetail> getPostDetails() {
        return postDetailRepository.findAll();
    }

    @Override
    public PostDetail getById(Long id) {
        Optional<PostDetail> postDetail = postDetailRepository.findById(id);
        if (postDetail.isPresent()){
            return postDetail.get();
        }
        return null;
    }

    @Override
    public void deletePostDetail(Long id) {
        postDetailRepository.deleteById(id);
    }
}
