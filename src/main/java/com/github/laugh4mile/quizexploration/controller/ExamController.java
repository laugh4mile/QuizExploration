package com.github.laugh4mile.quizexploration.controller;

import com.github.laugh4mile.quizexploration.entity.Exam;
import com.github.laugh4mile.quizexploration.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/exams")
public class ExamController {

    private final ExamService examService;


    // 1️⃣ 시험 목록 조회
    @GetMapping
    public String listExams(Model model) {
        model.addAttribute("exams", examService.findAllExams());
        model.addAttribute("view", "exam/list"); // html 경로
        model.addAttribute("fragment", "content"); // fragment 명
        return "layout";
    }

    // 2️⃣ 시험 등록 폼
    @GetMapping("/new")
    public String newExamForm(Model model) {
        model.addAttribute("exam", new Exam()); // templates/exam/new.html
//        model.addAttribute("view", "exam/list"); // html 경로
        model.addAttribute("view", "exam/new"); // html 경로
        model.addAttribute("fragment", "content"); // fragment 명
        return "layout";
    }

    // 3️⃣ 시험 등록 처리
    @PostMapping
    public String createExam(@ModelAttribute Exam exam) {
        examService.saveExam(exam);
        return "redirect:/exams";
    }
}
