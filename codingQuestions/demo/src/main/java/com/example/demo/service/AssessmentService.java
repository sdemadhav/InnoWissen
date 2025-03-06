package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Assessment;
import com.example.demo.repository.AssessmentRepo;

@Service
public class AssessmentService {
	
	@Autowired
	AssessmentRepo ar;

	public List<Assessment> getAllAssessments() {
		return ar.findAll();
	}

	public void addAssessment(Assessment asmt)
	{
		ar.save(asmt);
	}
	
	public Optional<Assessment> getAssessmentById(Long id) {
		return ar.findById(id);
	}


}
