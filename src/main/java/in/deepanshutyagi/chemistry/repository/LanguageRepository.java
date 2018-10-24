package in.deepanshutyagi.chemistry.repository;

import in.deepanshutyagi.chemistry.model.Course;
import in.deepanshutyagi.chemistry.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {
}
