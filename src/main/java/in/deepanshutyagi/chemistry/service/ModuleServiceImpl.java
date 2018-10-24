package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Module;
import in.deepanshutyagi.chemistry.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("moduleService")
public class ModuleServiceImpl implements ModuleService{

    @Autowired
    ModuleRepository moduleRepository;

    @Override
    public Module createModule(Module module) {
        return moduleRepository.save(module);
    }

    @Override
    public List<Module> getModules() {
        return moduleRepository.findAll();
    }

    @Override
    public Module getById(Long id) {
        Optional<Module> module = moduleRepository.findById(id);
        if (module.isPresent()){
            return module.get();
        }
        return null;
    }

    @Override
    public void deleteModule(Long id) {
        moduleRepository.deleteById(id);
    }
}

