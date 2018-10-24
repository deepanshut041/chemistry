package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.PCategory;

import java.util.List;

public interface PCategoryService {
    PCategory createPCategory(PCategory pCategory);
    List<PCategory> getPCategorys();
    PCategory getById(Long id);
    void deletePCategory(Long id);
}
