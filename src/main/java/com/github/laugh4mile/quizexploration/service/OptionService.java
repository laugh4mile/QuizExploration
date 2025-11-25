package com.github.laugh4mile.quizexploration.service;

import com.github.laugh4mile.quizexploration.repository.OptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OptionService {

    private final OptionRepository optionRepository;
}
