package com.github.laugh4mile.quizexploration.repository;

import com.github.laugh4mile.quizexploration.entity.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OptionRepository extends JpaRepository<Option, Long> {

    List<Option> findByQuizId(Long quizId);  // 특정 퀴즈의 선택지 조회
}
