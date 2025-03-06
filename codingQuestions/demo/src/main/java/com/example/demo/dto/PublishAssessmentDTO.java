package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Getter
@Setter
public class PublishAssessmentDTO {
    private String testName;
    private String assessmentType;
    private String status;         
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer durationMinutes;
    private String instructions;
    private String listedTestConfig; 
    private String proctoring_json;  
    private String jobRoleDetails;
    private Integer experienceMin;
    private Integer experienceMax;
    private Integer cutoffScore;
    private String recommendedSkills;
    
    private List<SectionDTO> sections;
    private List<QuestionDTO> standaloneQuestions;
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getAssessmentType() {
		return assessmentType;
	}
	public void setAssessmentType(String assessmentType) {
		this.assessmentType = assessmentType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public Integer getDurationMinutes() {
		return durationMinutes;
	}
	public void setDurationMinutes(Integer durationMinutes) {
		this.durationMinutes = durationMinutes;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public String getListedTestConfig() {
		return listedTestConfig;
	}
	public void setListedTestConfig(String listedTestConfig) {
		this.listedTestConfig = listedTestConfig;
	}
	public String getProctoring_json() {
		return proctoring_json;
	}
	public void setProctoring_json(String proctoring_json) {
		this.proctoring_json = proctoring_json;
	}
	public String getJobRoleDetails() {
		return jobRoleDetails;
	}
	public void setJobRoleDetails(String jobRoleDetails) {
		this.jobRoleDetails = jobRoleDetails;
	}
	public Integer getExperienceMin() {
		return experienceMin;
	}
	public void setExperienceMin(Integer experienceMin) {
		this.experienceMin = experienceMin;
	}
	public Integer getExperienceMax() {
		return experienceMax;
	}
	public void setExperienceMax(Integer experienceMax) {
		this.experienceMax = experienceMax;
	}
	public Integer getCutoffScore() {
		return cutoffScore;
	}
	public void setCutoffScore(Integer cutoffScore) {
		this.cutoffScore = cutoffScore;
	}
	public String getRecommendedSkills() {
		return recommendedSkills;
	}
	public void setRecommendedSkills(String recommendedSkills) {
		this.recommendedSkills = recommendedSkills;
	}
	public List<SectionDTO> getSections() {
		return sections;
	}
	public void setSections(List<SectionDTO> sections) {
		this.sections = sections;
	}
	public List<QuestionDTO> getStandaloneQuestions() {
		return standaloneQuestions;
	}
	public void setStandaloneQuestions(List<QuestionDTO> standaloneQuestions) {
		this.standaloneQuestions = standaloneQuestions;
	}
	
    
    
    
}
