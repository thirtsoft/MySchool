package com.school.services;

import com.school.dtos.SemestreDto;

import java.util.List;

public interface SemestreService {

    SemestreDto save(SemestreDto semestreDto);

    SemestreDto update(Long idAddress, SemestreDto semestreDto);

    SemestreDto findById(Long id);

    List<SemestreDto> findAll();

    void delete(Long id);

}
