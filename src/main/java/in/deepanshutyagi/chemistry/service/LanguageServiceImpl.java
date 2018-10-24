package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Language;
import in.deepanshutyagi.chemistry.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("languageService")
public class LanguageServiceImpl implements LanguageService{

    @Autowired
    LanguageRepository languageRepository;

    @Override
    public Language createLanguage(Language language) {
        return languageRepository.save(language);
    }

    @Override
    public List<Language> getLanguages() {
        return languageRepository.findAll();
    }

    @Override
    public Language getById(Long id) {
        Optional<Language> language = languageRepository.findById(id);
        if (language.isPresent()){
            return language.get();
        }
        return null;
    }

    @Override
    public void deleteLanguage(Long id) {
        languageRepository.deleteById(id);
    }
}
