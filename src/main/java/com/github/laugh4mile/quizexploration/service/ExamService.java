package com.github.laugh4mile.quizexploration.service;

import com.github.laugh4mile.quizexploration.entity.Exam;
import com.github.laugh4mile.quizexploration.repository.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamService {

    private final ExamRepository examRepository;

    public List<Exam> findAllExams() {
        return examRepository.findAll();
    }

    public Exam saveExam(Exam exam) {
        return examRepository.save(exam);
    }
}
