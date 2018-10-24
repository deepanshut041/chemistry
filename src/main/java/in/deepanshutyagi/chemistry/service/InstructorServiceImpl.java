package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Instructor;
import in.deepanshutyagi.chemistry.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("instructorService")
public class InstructorServiceImpl implements InstructorService{

    @Autowired
    InstructorRepository instructorRepository;

    @Override
    public Instructor createInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public List<Instructor> getInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor getById(Long id) {
        Optional<Instructor> instructor = instructorRepository.findById(id);
        if (instructor.isPresent()){
            return instructor.get();
        }
        return null;
    }

    @Override
    public void deleteInstructor(Long id) {
        instructorRepository.deleteById(id);
    }
}
