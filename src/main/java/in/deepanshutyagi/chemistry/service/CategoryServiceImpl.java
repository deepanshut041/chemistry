package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Category;
import in.deepanshutyagi.chemistry.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getCategorys() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        if (category.isPresent()){
            return category.get();
        }
        return null;
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
