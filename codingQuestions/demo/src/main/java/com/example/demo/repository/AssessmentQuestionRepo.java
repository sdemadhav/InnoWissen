package com.example.demo.repository;

import com.example.demo.entities.AssessmentQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@Repository
public interface AssessmentQuestionRepo extends JpaRepository<AssessmentQuestion, Long> {

    List<AssessmentQuestion> findByAssessmentId(Long assessmentId);

    List<AssessmentQuestion> findBySectionId(UUID sectionId);

}
