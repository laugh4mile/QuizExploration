package com.github.laugh4mile.quizexploration.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Exam 엔티티
 * - 하나의 시험을 나타냄
 * - 여러 Quiz를 가질 수 있음
 */
@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Exam 고유 ID

    @Column(nullable = false)
    private String name; // 시험 이름, 예: "정보처리기사"

    private String description; // 시험 설명

    @Column(nullable = true)
    private Integer maxScore; // 만점

    @Column(nullable = false)
    private Integer passScore; // 합격 기준 점수

    @Column(nullable = true)
    private Integer durationMinutes; // 시험 제한 시간 (분)

    private LocalDateTime createdAt = LocalDateTime.now(); // 생성일시

    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Quiz> quizzes; // 시험에 속한 모든 문제
}
