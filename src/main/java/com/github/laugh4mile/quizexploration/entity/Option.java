package com.github.laugh4mile.quizexploration.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * Option 엔티티
 * - 하나의 Quiz에 속하는 선택지
 * - label(A/B/C/D)과 content를 가짐
 */
@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Option 고유 ID

    @ManyToOne
    @JoinColumn(name = "quiz_id", nullable = false)
    private Quiz quiz; // 이 Option이 속한 문제

    @Column(nullable = false)
    private Integer seqNumber; // 덤프 순서(1,2,3,4 등)

    @Column(nullable = false)
    private String content; // 선택지 내용

    @Column(nullable = false)
    private boolean isCorrect; // 정답 여부

    private LocalDateTime createdAt = LocalDateTime.now(); // 생성일시
}
