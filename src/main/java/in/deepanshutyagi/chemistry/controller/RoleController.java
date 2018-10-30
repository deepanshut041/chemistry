package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.Role;
import in.deepanshutyagi.chemistry.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    @PostMapping({"/", ""})
    public Role addRole(@Valid Role role){
        return roleService.createRole(role);
    }

    @GetMapping({"/", ""})
    public List<Role> getAllRoles(){
        return roleService.getRoles();
    }

    @GetMapping("/{id}")
    public Role getRoleByID(@PathVariable Long id){
        return roleService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteRoleByID(@PathVariable Long id){
        roleService.deleteRole(id);
        return "Deleted Successfully";
    }

}
