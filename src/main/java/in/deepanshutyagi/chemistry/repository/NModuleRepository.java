package in.deepanshutyagi.chemistry.repository;

import in.deepanshutyagi.chemistry.model.NModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NModuleRepository extends JpaRepository<NModule, Long> {
}
