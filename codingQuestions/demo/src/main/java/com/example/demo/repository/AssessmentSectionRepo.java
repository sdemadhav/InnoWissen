package com.example.demo.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.AssessmentSection;

public interface AssessmentSectionRepo extends JpaRepository<AssessmentSection,UUID> {
	List<AssessmentSection> findByAssessmentId(Long assessmentId);

}
