package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Step;

import java.util.List;

public interface StepService {
    Step createStep(Step step);
    List<Step> getSteps();
    Step getById(Long id);
    void deleteStep(Long id);
}
