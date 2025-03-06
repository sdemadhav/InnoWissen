package com.example.demo.entities;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "assessment_question")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssessmentQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "assessment_id", nullable = false)
    private Assessment assessment; 

    @ManyToOne
    @JoinColumn(name = "section_id")
    private AssessmentSection section; 

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question; 

    @Column(name = "usage_count")
    private Long usageCount;

    @Column(name = "sequence_no", nullable = false, columnDefinition = "INTEGER DEFAULT 1")
    private Integer sequenceNo = 1; 

    @Column(name = "is_required", nullable = false, columnDefinition = "BOOLEAN DEFAULT TRUE")
    private Boolean isRequired = true;

    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT NOW()")
    private LocalDateTime createdAt = LocalDateTime.now();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Assessment getAssessment() {
		return assessment;
	}

	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}

	public AssessmentSection getSection() {
		return section;
	}

	public void setSection(AssessmentSection section) {
		this.section = section;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Long getUsageCount() {
		return usageCount;
	}

	public void setUsageCount(Long usageCount) {
		this.usageCount = usageCount;
	}

	public Integer getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public Boolean getIsRequired() {
		return isRequired;
	}

	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
    
    
}
