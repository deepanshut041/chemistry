package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.NModule;

import java.util.List;

public interface NModuleService {
    NModule createNModule(NModule nModule);
    List<NModule> getNModules();
    NModule getById(Long id);
    void deleteNModule(Long id);
}
