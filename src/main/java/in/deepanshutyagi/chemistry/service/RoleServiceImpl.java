package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Role;
import in.deepanshutyagi.chemistry.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("roleService")
public class RoleServiceImpl implements RoleService{

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getById(Long id) {
        Optional<Role> role = roleRepository.findById(id);
        if (role.isPresent()){
            return role.get();
        }
        return null;
    }

    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}
