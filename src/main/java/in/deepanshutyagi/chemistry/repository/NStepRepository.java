package in.deepanshutyagi.chemistry.repository;

import in.deepanshutyagi.chemistry.model.NStep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NStepRepository extends JpaRepository<NStep, Long> {
}
