package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.NStep;
import in.deepanshutyagi.chemistry.repository.NStepRepository;
import in.deepanshutyagi.chemistry.repository.NStepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("nStepService")
public class NStepServiceImpl implements NStepService {
    @Autowired
    NStepRepository nStepRepository;

    @Override
    public NStep createNStep(NStep nStep) {
        return nStepRepository.save(nStep);
    }

    @Override
    public List<NStep> getNSteps() {
        return nStepRepository.findAll();
    }

    @Override
    public NStep getById(Long id) {
        Optional<NStep> nStep = nStepRepository.findById(id);
        if (nStep.isPresent()){
            return nStep.get();
        }
        return null;
    }

    @Override
    public void deleteNStep(Long id) {
        nStepRepository.deleteById(id);
    }
}
