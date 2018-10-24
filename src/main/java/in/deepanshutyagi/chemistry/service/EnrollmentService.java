package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Enrollment;

import java.util.List;

public interface EnrollmentService {
    Enrollment createEnrollment(Enrollment enrollment);
    List<Enrollment> getEnrollments();
    Enrollment getById(Long id);
    void deleteEnrollment(Long id);
}
