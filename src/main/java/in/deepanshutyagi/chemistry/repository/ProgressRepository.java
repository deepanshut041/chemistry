package in.deepanshutyagi.chemistry.repository;

import in.deepanshutyagi.chemistry.model.Course;
import in.deepanshutyagi.chemistry.model.Progress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressRepository extends JpaRepository<Progress, Long> {
}
