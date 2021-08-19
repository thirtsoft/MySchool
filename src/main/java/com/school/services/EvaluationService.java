package com.school.services;

import com.school.dtos.EvaluationDto;

import java.util.List;

public interface EvaluationService {

    EvaluationDto save(EvaluationDto evaluationDto);

    EvaluationDto update(Long idAddress, EvaluationDto evaluationDto);

    EvaluationDto findById(Long id);

    List<EvaluationDto> findAll();

    void delete(Long id);

}
