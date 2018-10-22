package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.repository.NStepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("nStepService")
public class NStepServiceImpl implements NStepService {
    @Autowired
    NStepRepository nStepRepository;
}
