package in.deepanshutyagi.chemistry.repository;

import in.deepanshutyagi.chemistry.model.Category;
import in.deepanshutyagi.chemistry.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
