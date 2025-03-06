package com.example.demo.service;

import com.example.demo.entities.AssessmentQuestion;
import com.example.demo.repository.AssessmentQuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AssessmentQuestionService {

    @Autowired
    private AssessmentQuestionRepo assessmentQuestionRepo;

    public List<AssessmentQuestion> getAllAssessmentQuestions() {
        return assessmentQuestionRepo.findAll();
    }

    public AssessmentQuestion addAssessmentQuestion(AssessmentQuestion assessmentQuestion) {
        return assessmentQuestionRepo.save(assessmentQuestion);
    }

    public Optional<AssessmentQuestion> getAssessmentQuestionById(Long id) {
        return assessmentQuestionRepo.findById(id);
    }
}
