package com.github.laugh4mile.quizexploration.repository;

import com.github.laugh4mile.quizexploration.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

    List<Quiz> findByExamId(Long examId);  // 특정 시험에 속한 모든 퀴즈 조회
}
