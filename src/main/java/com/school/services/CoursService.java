package com.school.services;

import com.school.dtos.CoursDto;

import java.util.List;

public interface CoursService {

    CoursDto save(CoursDto coursDto);

    CoursDto update(Long idAddress, CoursDto coursDto);

    CoursDto findById(Long id);

    List<CoursDto> findAll();

    void delete(Long id);

}
