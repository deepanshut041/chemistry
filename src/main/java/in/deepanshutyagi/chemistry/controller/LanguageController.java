package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.Language;
import in.deepanshutyagi.chemistry.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/language")
public class LanguageController {
    @Autowired
    LanguageService languageService;

    @PostMapping({"/", ""})
    public Language addLanguage(@Valid Language language){
        return languageService.createLanguage(language);
    }

    @GetMapping({"/", ""})
    public List<Language> getAllLanguages(){
        return languageService.getLanguages();
    }

    @GetMapping("/{id}")
    public Language getLanguageByID(@PathVariable Long id){
        return languageService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteLanguageByID(@PathVariable Long id){
        languageService.deleteLanguage(id);
        return "Deleted Successfully";
    }

}
