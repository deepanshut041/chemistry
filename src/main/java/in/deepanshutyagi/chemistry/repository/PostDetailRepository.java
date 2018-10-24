package in.deepanshutyagi.chemistry.repository;

import in.deepanshutyagi.chemistry.model.Course;
import in.deepanshutyagi.chemistry.model.PostDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDetailRepository extends JpaRepository<PostDetail, Long> {
}
