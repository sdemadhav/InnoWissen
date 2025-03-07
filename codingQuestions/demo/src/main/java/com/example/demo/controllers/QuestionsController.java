package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Question;
import com.example.demo.service.QuestionsService;

@RestController
@RequestMapping("/questions") 
@CrossOrigin("*")
public class QuestionsController {

    @Autowired
    private QuestionsService qs;

    @GetMapping("/all")
    public List<Question> getAllQuestions() {
        return qs.getAllQuestions();
    }

    @PostMapping("/add")
    public Question addQuestion(@RequestBody Question question) {
        return qs.addQuestion(question);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> getQuestionById(@PathVariable("id") int id) { 
        return qs.getQuestionById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
