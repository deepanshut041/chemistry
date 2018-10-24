package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Progress;
import in.deepanshutyagi.chemistry.repository.ProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("progressService")
public class ProgressServiceImpl implements ProgressService{

    @Autowired
    ProgressRepository progressRepository;

    @Override
    public Progress createProgress(Progress progress) {
        return progressRepository.save(progress);
    }

    @Override
    public List<Progress> getProgresss() {
        return progressRepository.findAll();
    }

    @Override
    public Progress getById(Long id) {
        Optional<Progress> progress = progressRepository.findById(id);
        if (progress.isPresent()){
            return progress.get();
        }
        return null;
    }

    @Override
    public void deleteProgress(Long id) {
        progressRepository.deleteById(id);
    }
}
