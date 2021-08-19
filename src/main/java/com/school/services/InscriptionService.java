package com.school.services;

import com.school.dtos.InscriptionDto;

import java.util.List;

public interface InscriptionService {

    InscriptionDto save(InscriptionDto inscriptionDto);

    InscriptionDto update(Long idAddress, InscriptionDto inscriptionDto);

    InscriptionDto findById(Long id);

    List<InscriptionDto> findAll();

    void delete(Long id);

}
