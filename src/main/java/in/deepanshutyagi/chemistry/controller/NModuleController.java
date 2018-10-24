package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.NModule;
import in.deepanshutyagi.chemistry.service.NModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/notes/module")
public class NModuleController {
    @Autowired
    NModuleService nModuleService;

    @PostMapping({"/", ""})
    public NModule addNModule(@Valid NModule nModule){
        return nModuleService.createNModule(nModule);
    }

    @GetMapping({"/", ""})
    public List<NModule> getAllNModules(){
        return nModuleService.getNModules();
    }

    @GetMapping("/{id}")
    public NModule getNModuleByID(@PathVariable Long id){
        return nModuleService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteNModuleByID(@PathVariable Long id){
        nModuleService.deleteNModule(id);
        return "Deleted Successfully";
    }

}
