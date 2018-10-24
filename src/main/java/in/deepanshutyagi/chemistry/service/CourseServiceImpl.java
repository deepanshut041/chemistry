package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Course;
import in.deepanshutyagi.chemistry.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("courseService")
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseRepository courseRepository;

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getById(Long id) {
        Optional<Course> course = courseRepository.findById(id);
        if (course.isPresent()){
            return course.get();
        }
        return null;
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
