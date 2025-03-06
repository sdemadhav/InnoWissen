package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Question;
import com.example.demo.repository.QuestionsRepo;

import jakarta.transaction.Transactional;

@Service
public class QuestionsService {

    @Autowired
    private QuestionsRepo qr;


    @Transactional  
    public List<Question> getAllQuestions() {
        return qr.findAll();
    }

    @Transactional
    public Question addQuestion(Question question) {
        return qr.save(question);
    }

    @Transactional
    public Optional<Question> getQuestionById(int id) {
        return qr.findById(id);
    }

}
