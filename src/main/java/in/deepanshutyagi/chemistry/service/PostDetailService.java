package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.PostDetail;

import java.util.List;

public interface PostDetailService {
    PostDetail createPostDetail(PostDetail postDetail);
    List<PostDetail> getPostDetails();
    PostDetail getById(Long id);
    void deletePostDetail(Long id);
}
