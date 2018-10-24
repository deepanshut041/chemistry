package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.PCategory;
import in.deepanshutyagi.chemistry.service.PCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/pCategory")
public class PCategoryController {
    @Autowired
    PCategoryService pCategoryService;

    @PostMapping({"/", ""})
    public PCategory addPCategory(@Valid PCategory pCategory){
        return pCategoryService.createPCategory(pCategory);
    }

    @GetMapping({"/", ""})
    public List<PCategory> getAllPCategorys(){
        return pCategoryService.getPCategorys();
    }

    @GetMapping("/{id}")
    public PCategory getPCategoryByID(@PathVariable Long id){
        return pCategoryService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deletePCategoryByID(@PathVariable Long id){
        pCategoryService.deletePCategory(id);
        return "Deleted Successfully";
    }

}
