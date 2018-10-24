package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.NStep;
import in.deepanshutyagi.chemistry.service.NStepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/notes/step")
public class NStepController {
    @Autowired
    NStepService nStepService;

    @PostMapping({"/", ""})
    public NStep addNStep(@Valid NStep nStep){
        return nStepService.createNStep(nStep);
    }

    @GetMapping({"/", ""})
    public List<NStep> getAllNSteps(){
        return nStepService.getNSteps();
    }

    @GetMapping("/{id}")
    public NStep getNStepByID(@PathVariable Long id){
        return nStepService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteNStepByID(@PathVariable Long id){
        nStepService.deleteNStep(id);
        return "Deleted Successfully";
    }

}
