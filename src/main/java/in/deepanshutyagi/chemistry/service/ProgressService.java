package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Progress;

import java.util.List;

public interface ProgressService {
    Progress createProgress(Progress progress);
    List<Progress> getProgresss();
    Progress getById(Long id);
    void deleteProgress(Long id);
}
