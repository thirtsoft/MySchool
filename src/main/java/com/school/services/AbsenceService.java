package com.school.services;

import com.school.dtos.AbsenceDto;

import java.util.List;

public interface AbsenceService {

    AbsenceDto save(AbsenceDto absenceDto);

    AbsenceDto update(Long idAddress, AbsenceDto absenceDto);

    AbsenceDto findById(Long id);

    List<AbsenceDto> findAll();

    void delete(Long id);

}
