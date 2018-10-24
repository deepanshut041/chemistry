package in.deepanshutyagi.chemistry.repository;

import in.deepanshutyagi.chemistry.model.Comment;
import in.deepanshutyagi.chemistry.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
