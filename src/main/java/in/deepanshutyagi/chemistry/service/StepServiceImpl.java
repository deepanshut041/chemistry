package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.repository.StepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("stepService")
public class StepServiceImpl implements StepService {
    @Autowired
    StepRepository stepRepository;
}
