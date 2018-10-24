package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Language;

import java.util.List;

public interface LanguageService {
    Language createLanguage(Language language);
    List<Language> getLanguages();
    Language getById(Long id);
    void deleteLanguage(Long id);
}
