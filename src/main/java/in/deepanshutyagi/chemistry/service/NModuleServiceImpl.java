package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.NModule;
import in.deepanshutyagi.chemistry.repository.NModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("nNModuleService")
public class NModuleServiceImpl implements NModuleService {

    @Autowired
    NModuleRepository nNModuleRepository;

    @Override
    public NModule createNModule(NModule nNModule) {
        return nNModuleRepository.save(nNModule);
    }

    @Override
    public List<NModule> getNModules() {
        return nNModuleRepository.findAll();
    }

    @Override
    public NModule getById(Long id) {
        Optional<NModule> nNModule = nNModuleRepository.findById(id);
        if (nNModule.isPresent()){
            return nNModule.get();
        }
        return null;
    }

    @Override
    public void deleteNModule(Long id) {
        nNModuleRepository.deleteById(id);
    }
}
