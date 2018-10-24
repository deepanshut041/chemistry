package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Course;

import java.util.List;

public interface CourseService {
    Course createCourse(Course course);
    List<Course> getCourses();
    Course getById(Long id);
    void deleteCourse(Long id);
}
