package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.repository.NModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("nModuleService")
public class NModuleServiceImpl implements NModuleService {

    @Autowired
    NModuleRepository nModuleRepository;
}
