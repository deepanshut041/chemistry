package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.Student;
import in.deepanshutyagi.chemistry.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping({"/", ""})
    public Student addStudent(@Valid Student student){
        return studentService.createStudent(student);
    }

    @GetMapping({"/", ""})
    public List<Student> getAllStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentByID(@PathVariable Long id){
        return studentService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteStudentByID(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "Deleted Successfully";
    }

}
