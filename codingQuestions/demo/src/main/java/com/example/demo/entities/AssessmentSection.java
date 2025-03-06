package com.example.demo.entities;

import java.time.LocalDateTime;
import java.util.UUID;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "assessment_section")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssessmentSection {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "assessment_id", nullable = false)
    private Assessment assessment;

    @Column(name = "section_type", nullable = false, length = 50)
    private String sectionType;

    @Column(name = "num_required_questions", nullable = false)
    private Integer numRequiredQuestions;

    @Column(name = "created_datetime", nullable = false, updatable = false)
    private LocalDateTime createdDatetime;

    @Column(name = "updated_datetime", nullable = false)
    private LocalDateTime updatedDatetime;

    @PrePersist
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        this.createdDatetime = now;
        this.updatedDatetime = now;
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedDatetime = LocalDateTime.now();
    }

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Assessment getAssessment() {
		return assessment;
	}

	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}

	public String getSectionType() {
		return sectionType;
	}

	public void setSectionType(String sectionType) {
		this.sectionType = sectionType;
	}

	public Integer getNumRequiredQuestions() {
		return numRequiredQuestions;
	}

	public void setNumRequiredQuestions(Integer numRequiredQuestions) {
		this.numRequiredQuestions = numRequiredQuestions;
	}

	public LocalDateTime getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(LocalDateTime createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public LocalDateTime getUpdatedDatetime() {
		return updatedDatetime;
	}

	public void setUpdatedDatetime(LocalDateTime updatedDatetime) {
		this.updatedDatetime = updatedDatetime;
	}
    
    
    
    
}
