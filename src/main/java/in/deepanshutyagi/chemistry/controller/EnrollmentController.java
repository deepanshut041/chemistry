package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.Enrollment;
import in.deepanshutyagi.chemistry.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/enrollment")
public class EnrollmentController {
    @Autowired
    EnrollmentService enrollmentService;

    @PostMapping({"/", ""})
    public Enrollment addEnrollment(@Valid Enrollment enrollment){
        return enrollmentService.createEnrollment(enrollment);
    }

    @GetMapping({"/", ""})
    public List<Enrollment> getAllEnrollments(){
        return enrollmentService.getEnrollments();
    }

    @GetMapping("/{id}")
    public Enrollment getEnrollmentByID(@PathVariable Long id){
        return enrollmentService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteEnrollmentByID(@PathVariable Long id){
        enrollmentService.deleteEnrollment(id);
        return "Deleted Successfully";
    }

}
