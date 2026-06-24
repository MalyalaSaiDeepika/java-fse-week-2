package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.QuizAttempt;
import com.cognizant.ormlearn.repository.QuizAttemptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class QuizAttemptService {

    @Autowired
    private QuizAttemptRepository repository;

    public List<QuizAttempt> getAllAttempts() {
        return repository.getAllAttempts();
    }

    public List<QuizAttempt> getPassedAttempts() {
        return repository.getPassedAttempts();
    }
}