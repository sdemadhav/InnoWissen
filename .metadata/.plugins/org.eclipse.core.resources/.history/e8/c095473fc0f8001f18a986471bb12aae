package com.example.demo.service;

import com.example.demo.entities.AssessmentSection;
import com.example.demo.repository.AssessmentSectionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AssessmentSectionService {

    @Autowired
    private AssessmentSectionRepo assessmentSectionRepo;

    public List<AssessmentSection> getAllSections() {
        return assessmentSectionRepo.findAll();
    }

    public AssessmentSection addSection(AssessmentSection section) {
        return assessmentSectionRepo.save(section);
    }

    public Optional<AssessmentSection> getSectionById(UUID id) {
        return assessmentSectionRepo.findById(id);
    }
}
