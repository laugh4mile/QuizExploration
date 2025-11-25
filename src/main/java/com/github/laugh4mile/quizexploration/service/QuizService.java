package com.github.laugh4mile.quizexploration.service;

import com.github.laugh4mile.quizexploration.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizService {

    private final QuizRepository quizRepository;
}
