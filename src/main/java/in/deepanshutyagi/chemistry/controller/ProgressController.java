package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.Progress;
import in.deepanshutyagi.chemistry.service.ProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/progress")
public class ProgressController {
    @Autowired
    ProgressService progressService;

    @PostMapping({"/", ""})
    public Progress addProgress(@Valid Progress progress){
        return progressService.createProgress(progress);
    }

    @GetMapping({"/", ""})
    public List<Progress> getAllProgresss(){
        return progressService.getProgresss();
    }

    @GetMapping("/{id}")
    public Progress getProgressByID(@PathVariable Long id){
        return progressService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProgressByID(@PathVariable Long id){
        progressService.deleteProgress(id);
        return "Deleted Successfully";
    }

}
