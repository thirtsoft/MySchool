package com.school.services.Impl;

import com.school.dtos.ObservationDto;
import com.school.repository.ObservationRepository;
import com.school.services.ObservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ObservationServiceImpl implements ObservationService {

    private final ObservationRepository observationRepository;

    @Override
    public ObservationDto save(ObservationDto observationDto) {
        return null;
    }

    @Override
    public ObservationDto update(Long idAddress, ObservationDto observationDto) {
        return null;
    }

    @Override
    public ObservationDto findById(Long id) {
        return null;
    }

    @Override
    public List<ObservationDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
