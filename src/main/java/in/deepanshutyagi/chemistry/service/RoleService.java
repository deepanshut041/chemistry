package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Role;

import java.util.List;

public interface RoleService {
    Role createRole(Role role);
    List<Role> getRoles();
    Role getById(Long id);
    void deleteRole(Long id);
}
