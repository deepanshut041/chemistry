package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Step;
import in.deepanshutyagi.chemistry.repository.StepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("stepService")
public class StepServiceImpl implements StepService{

    @Autowired
    StepRepository stepRepository;

    @Override
    public Step createStep(Step step) {
        return stepRepository.save(step);
    }

    @Override
    public List<Step> getSteps() {
        return stepRepository.findAll();
    }

    @Override
    public Step getById(Long id) {
        Optional<Step> step = stepRepository.findById(id);
        if (step.isPresent()){
            return step.get();
        }
        return null;
    }

    @Override
    public void deleteStep(Long id) {
        stepRepository.deleteById(id);
    }
}
