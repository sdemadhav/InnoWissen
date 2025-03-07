package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.AssessmentQuestion;
import com.example.demo.service.AssessmentQuestionService;

@RestController
@RequestMapping("/assessment-questions")
public class AssessmentQuestionController {

    @Autowired
    private AssessmentQuestionService assessmentQuestionService;

    @GetMapping("/")
    public List<AssessmentQuestion> getAllAssessmentQuestions() {
        return assessmentQuestionService.getAllAssessmentQuestions();
    }

    @PostMapping("/add")
    public ResponseEntity<AssessmentQuestion> addAssessmentQuestion(@RequestBody AssessmentQuestion assessmentQuestion) {
        AssessmentQuestion savedAssessmentQuestion = assessmentQuestionService.addAssessmentQuestion(assessmentQuestion);
        return ResponseEntity.status(201).body(savedAssessmentQuestion);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AssessmentQuestion> getAssessmentQuestionById(@PathVariable("id") Long id) {
        return assessmentQuestionService.getAssessmentQuestionById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
