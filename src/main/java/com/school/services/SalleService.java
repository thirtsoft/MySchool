package com.school.services;

import com.school.dtos.SalleDto;

import java.util.List;

public interface SalleService {

    SalleDto save(SalleDto salleDto);

    SalleDto update(Long idAddress, SalleDto salleDto);

    SalleDto findById(Long id);

    List<SalleDto> findAll();

    void delete(Long id);

}
