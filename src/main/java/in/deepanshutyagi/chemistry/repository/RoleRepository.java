package in.deepanshutyagi.chemistry.repository;

import in.deepanshutyagi.chemistry.model.Role;
import in.deepanshutyagi.chemistry.model.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
