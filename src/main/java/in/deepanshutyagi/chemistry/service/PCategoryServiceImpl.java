package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.PCategory;
import in.deepanshutyagi.chemistry.repository.PCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("pCategoryService")
public class PCategoryServiceImpl implements PCategoryService{

    @Autowired
    PCategoryRepository pCategoryRepository;

    @Override
    public PCategory createPCategory(PCategory pCategory) {
        return pCategoryRepository.save(pCategory);
    }

    @Override
    public List<PCategory> getPCategorys() {
        return pCategoryRepository.findAll();
    }

    @Override
    public PCategory getById(Long id) {
        Optional<PCategory> pCategory = pCategoryRepository.findById(id);
        if (pCategory.isPresent()){
            return pCategory.get();
        }
        return null;
    }

    @Override
    public void deletePCategory(Long id) {
        pCategoryRepository.deleteById(id);
    }
}
