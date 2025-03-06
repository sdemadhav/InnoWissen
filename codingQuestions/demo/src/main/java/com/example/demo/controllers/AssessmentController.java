package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PublishAssessmentDTO;
import com.example.demo.entities.Assessment;
import com.example.demo.service.AssessmentPublishService;
import com.example.demo.service.AssessmentService;

@RestController
@RequestMapping("/assessments")
@CrossOrigin("*")
public class AssessmentController {

    @Autowired
    private AssessmentService as;
    
    @Autowired
    private AssessmentPublishService assessmentPublishService;

    @GetMapping("/")
    public List<Assessment> getAllAssessments() {
        return as.getAllAssessments();
    }

    @PostMapping("/add")
    public void createAssessment(@RequestBody Assessment assessment){
    	as.addAssessment(assessment);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Assessment> getAssessmentById(@PathVariable("id") Long id) {
        Optional<Assessment> assessment = as.getAssessmentById(id);
        return assessment.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    @PostMapping("/publish/{id}")
    public ResponseEntity<String> publishAssessment(@PathVariable("id") Long id, @RequestBody PublishAssessmentDTO publishAssessmentDTO) {
        return assessmentPublishService.publishAssessment(id, publishAssessmentDTO);
    }
}
