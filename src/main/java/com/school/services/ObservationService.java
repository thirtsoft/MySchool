package com.school.services;

import com.school.dtos.ObservationDto;

import java.util.List;

public interface ObservationService {

    ObservationDto save(ObservationDto observationDto);

    ObservationDto update(Long idAddress, ObservationDto observationDto);

    ObservationDto findById(Long id);

    List<ObservationDto> findAll();

    void delete(Long id);

}
