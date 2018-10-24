package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.Category;
import in.deepanshutyagi.chemistry.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping({"/", ""})
    public Category addCategory(@Valid Category category){
        return categoryService.createCategory(category);
    }

    @GetMapping({"/", ""})
    public List<Category> getAllCategorys(){
        return categoryService.getCategorys();
    }

    @GetMapping("/{id}")
    public Category getCategoryByID(@PathVariable Long id){
        return categoryService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCategoryByID(@PathVariable Long id){
        categoryService.deleteCategory(id);
        return "Deleted Successfully";
    }

}
