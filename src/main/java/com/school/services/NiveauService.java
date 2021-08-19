package com.school.services;

import com.school.dtos.NiveauDto;

import java.util.List;

public interface NiveauService {

    NiveauDto save(NiveauDto niveauDto);

    NiveauDto update(Long idAddress, NiveauDto niveauDto);

    NiveauDto findById(Long id);

    List<NiveauDto> findAll();

    void delete(Long id);

}
