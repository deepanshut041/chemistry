package in.deepanshutyagi.chemistry.repository;

import in.deepanshutyagi.chemistry.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {
}