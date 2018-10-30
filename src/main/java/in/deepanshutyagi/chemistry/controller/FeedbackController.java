package in.deepanshutyagi.chemistry.controller;


import in.deepanshutyagi.chemistry.model.Feedback;
import in.deepanshutyagi.chemistry.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {
    @Autowired
    FeedbackService feedbackService;

    @PostMapping({"/", ""})
    public Feedback addFeedback(@Valid Feedback feedback){
        return feedbackService.createFeedback(feedback);
    }

    @GetMapping({"/", ""})
    public List<Feedback> getAllFeedbacks(){
        return feedbackService.getFeedbacks();
    }

    @GetMapping("/{id}")
    public Feedback getFeedbackByID(@PathVariable Long id){
        return feedbackService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteFeedbackByID(@PathVariable Long id){
        feedbackService.deleteFeedback(id);
        return "Deleted Successfully";
    }

}
