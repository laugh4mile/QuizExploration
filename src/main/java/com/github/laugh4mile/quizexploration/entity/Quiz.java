package com.github.laugh4mile.quizexploration.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Quiz 엔티티
 * - 하나의 문제(Quiz)를 나타냄
 * - 여러 선택지(Option)와 정답 Option을 가짐
 * - Exam 엔티티에 속함
 */
@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Quiz 고유 ID

    @ManyToOne
    @JoinColumn(name = "exam_id", nullable = false)
    private Exam exam; // 이 Quiz가 속한 시험

    @Column(nullable = false)
    private String content; // 문제 내용

    private String explanation; // 문제 해설

    private LocalDateTime createdAt; // 생성일시

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Option> options; // 문제에 속한 모든 선택지
}
