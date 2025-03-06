package com.example.demo.dto;

import lombok.Data;
import java.util.List;

@Data
public class SectionDTO {
    private String sectionType;
    private Integer numRequiredQuestions;
    private List<QuestionDTO> questions;
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
	public List<QuestionDTO> getQuestions() {
		return questions;
	}
	public void setQuestions(List<QuestionDTO> questions) {
		this.questions = questions;
	} 
    
    
}
