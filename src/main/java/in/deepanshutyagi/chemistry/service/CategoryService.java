package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Category;

import java.util.List;

public interface CategoryService {
    Category createCategory(Category category);
    List<Category> getCategorys();
    Category getById(Long id);
    void deleteCategory(Long id);
}
