package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("courseService")
public class CourseServiceImpl {

    @Autowired
    CourseRepository courseRepository;
}
