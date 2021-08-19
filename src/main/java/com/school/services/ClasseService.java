package com.school.services;

import com.school.dtos.ClasseDto;

import java.util.List;

public interface ClasseService {

    ClasseDto save(ClasseDto classeDto);

    ClasseDto update(Long idAddress, ClasseDto classeDto);

    ClasseDto findById(Long id);

    List<ClasseDto> findAll();

    void delete(Long id);

}
