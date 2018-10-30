package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.Category;
import in.deepanshutyagi.chemistry.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/step")
public class StepController {
    @Autowired
    CategoryService stepService;

    @PostMapping({"/", ""})
    public Category addCategory(@Valid Category step){
        return stepService.createCategory(step);
    }

    @GetMapping({"/", ""})
    public List<Category> getAllCategorys(){
        return stepService.getCategorys();
    }

    @GetMapping("/{id}")
    public Category getStepByID(@PathVariable Long id){
        return stepService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCategoryByID(@PathVariable Long id){
        stepService.deleteCategory(id);
        return "Deleted Successfully";
    }

}
