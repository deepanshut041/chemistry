package in.deepanshutyagi.chemistry.service;

import in.deepanshutyagi.chemistry.model.Feedback;

import java.util.List;

public interface FeedbackService {
    Feedback createFeedback(Feedback feedback);
    List<Feedback> getFeedbacks();
    Feedback getById(Long id);
    void deleteFeedback(Long id);
}
