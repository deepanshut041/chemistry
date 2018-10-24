package in.deepanshutyagi.chemistry.repository;

import in.deepanshutyagi.chemistry.model.Course;
import in.deepanshutyagi.chemistry.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
