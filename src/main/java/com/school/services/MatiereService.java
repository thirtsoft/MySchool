package com.school.services;

import com.school.dtos.MatiereDto;

import java.util.List;

public interface MatiereService {

    MatiereDto save(MatiereDto matiereDto);

    MatiereDto update(Long idAddress, MatiereDto matiereDto);

    MatiereDto findById(Long id);

    List<MatiereDto> findAll();

    void delete(Long id);

}
