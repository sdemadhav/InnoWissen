package com.example.demo.dto;

import lombok.Data;

@Data
public class QuestionDTO {
	
	private int id;
    private String type;
    private String title;
    private String problemStatement;
    private String difficultyLevel;
    private int maxScore;
    private int negativeScore;
    private int timeBoundSeconds;
    private boolean isActive;
    private boolean isDraft;
    private boolean aiEvaluationEnabled;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProblemStatement() {
		return problemStatement;
	}
	public void setProblemStatement(String problemStatement) {
		this.problemStatement = problemStatement;
	}
	public String getDifficultyLevel() {
		return difficultyLevel;
	}
	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	public int getMaxScore() {
		return maxScore;
	}
	public void setMaxScore(int maxScore) {
		this.maxScore = maxScore;
	}
	public int getNegativeScore() {
		return negativeScore;
	}
	public void setNegativeScore(int negativeScore) {
		this.negativeScore = negativeScore;
	}
	public int getTimeBoundSeconds() {
		return timeBoundSeconds;
	}
	public void setTimeBoundSeconds(int timeBoundSeconds) {
		this.timeBoundSeconds = timeBoundSeconds;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isDraft() {
		return isDraft;
	}
	public void setDraft(boolean isDraft) {
		this.isDraft = isDraft;
	}
	public boolean isAiEvaluationEnabled() {
		return aiEvaluationEnabled;
	}
	public void setAiEvaluationEnabled(boolean aiEvaluationEnabled) {
		this.aiEvaluationEnabled = aiEvaluationEnabled;
	}
    
    
}
