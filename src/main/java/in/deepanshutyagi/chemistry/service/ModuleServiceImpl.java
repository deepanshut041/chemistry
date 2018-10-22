package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("moduleService")
public class ModuleServiceImpl implements ModuleService{

    @Autowired
    ModuleRepository moduleRepository;
}
