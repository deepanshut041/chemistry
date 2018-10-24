package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Enrollment;
import in.deepanshutyagi.chemistry.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("enrollmentService")
public class EnrollmentServiceImpl implements EnrollmentService{

    @Autowired
    EnrollmentRepository enrollmentRepository;

    @Override
    public Enrollment createEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    @Override
    public List<Enrollment> getEnrollments() {
        return enrollmentRepository.findAll();
    }

    @Override
    public Enrollment getById(Long id) {
        Optional<Enrollment> enrollment = enrollmentRepository.findById(id);
        if (enrollment.isPresent()){
            return enrollment.get();
        }
        return null;
    }

    @Override
    public void deleteEnrollment(Long id) {
        enrollmentRepository.deleteById(id);
    }
}
