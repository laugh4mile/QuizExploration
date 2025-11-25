package com.github.laugh4mile.quizexploration.repository;

import com.github.laugh4mile.quizexploration.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
}
