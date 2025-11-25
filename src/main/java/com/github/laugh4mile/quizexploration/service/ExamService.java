package com.github.laugh4mile.quizexploration.service;

import com.github.laugh4mile.quizexploration.repository.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExamService {

    private final ExamRepository examRepository;
}
