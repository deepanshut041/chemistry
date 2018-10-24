package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Instructor;

import java.util.List;

public interface InstructorService {
    Instructor createInstructor(Instructor instructor);
    List<Instructor> getInstructors();
    Instructor getById(Long id);
    void deleteInstructor(Long id);
}
