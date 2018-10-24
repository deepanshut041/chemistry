package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    List<Student> getStudents();
    Student getById(Long id);
    void deleteStudent(Long id);
}
