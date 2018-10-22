package in.deepanshutyagi.chemistry.repository;

import in.deepanshutyagi.chemistry.model.Step;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StepRepository extends JpaRepository<Step, Long> {
}
