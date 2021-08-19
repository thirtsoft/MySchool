package com.school.services.Impl;

import com.school.dtos.EvaluationDto;
import com.school.repository.EvaluationRepository;
import com.school.services.EvaluationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class EvaluationServieImpl implements EvaluationService {

    private final EvaluationRepository evaluationRepository;

    @Override
    public EvaluationDto save(EvaluationDto evaluationDto) {
        return null;
    }

    @Override
    public EvaluationDto update(Long idAddress, EvaluationDto evaluationDto) {
        return null;
    }

    @Override
    public EvaluationDto findById(Long id) {
        return null;
    }

    @Override
    public List<EvaluationDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
