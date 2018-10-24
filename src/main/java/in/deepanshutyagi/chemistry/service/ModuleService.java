package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Module;

import java.util.List;

public interface ModuleService {
    Module createModule(Module module);
    List<Module> getModules();
    Module getById(Long id);
    void deleteModule(Long id);
}
