package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.NStep;

import java.util.List;

public interface NStepService {
    NStep createNStep(NStep nStep);
    List<NStep> getNSteps();
    NStep getById(Long id);
    void deleteNStep(Long id);
}
