package com.school.services;

import com.school.dtos.BatimentDto;

import java.util.List;

public interface BatimentService {

    BatimentDto save(BatimentDto batimentDto);

    BatimentDto update(Long idAddress, BatimentDto batimentDto);

    BatimentDto findById(Long id);

    List<BatimentDto> findAll();

    void delete(Long id);

}
