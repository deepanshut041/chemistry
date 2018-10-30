package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.Instructor;
import in.deepanshutyagi.chemistry.model.Module;
import in.deepanshutyagi.chemistry.service.InstructorService;
import in.deepanshutyagi.chemistry.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/instructor")
public class InstructorController {
    @Autowired
    InstructorService instructorService;

    @PostMapping({"/", ""})
    public Instructor addInstructor(@Valid Instructor instructor){
        return instructorService.createInstructor(instructor);
    }

    @GetMapping({"/", ""})
    public List<Instructor> getAllInstructors(){
        return instructorService.getInstructors();
    }

    @GetMapping("/{id}")
    public Instructor getInstructorByID(@PathVariable Long id){
        return instructorService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteInstructorByID(@PathVariable Long id){
        instructorService.deleteInstructor(id);
        return "Deleted Successfully";
    }

    @RestController
    @RequestMapping("/api/module")
    public static class ModuleController {
        @Autowired
        ModuleService moduleService;

        @PostMapping({"/", ""})
        public Module addModule(@Valid Module module){
            return moduleService.createModule(module);
        }

        @GetMapping({"/", ""})
        public List<Module> getAllModules(){
            return moduleService.getModules();
        }

        @GetMapping("/{id}")
        public Module getModuleByID(@PathVariable Long id){
            return moduleService.getById(id);
        }

        @DeleteMapping("/{id}")
        public String deleteModuleByID(@PathVariable Long id){
            moduleService.deleteModule(id);
            return "Deleted Successfully";
        }

    }
}
