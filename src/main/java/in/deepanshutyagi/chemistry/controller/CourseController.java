package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.Course;
import in.deepanshutyagi.chemistry.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping({"/", ""})
    public Course addCourse(@Valid Course course){
        return courseService.createCourse(course);
    }

    @GetMapping({"/", ""})
    public List<Course> getAllCourses(){
        return courseService.getCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseByID(@PathVariable Long id){
        return courseService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCourseByID(@PathVariable Long id){
        courseService.deleteCourse(id);
        return "Deleted Successfully";
    }

}
