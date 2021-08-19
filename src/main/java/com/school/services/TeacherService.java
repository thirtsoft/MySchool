package com.school.services;

import com.school.dtos.TeacherDto;

import java.util.List;

public interface TeacherService {

    TeacherDto save(TeacherDto teacherDto);

    TeacherDto update(Long idAddress, TeacherDto teacherDto);

    TeacherDto findById(Long id);

    List<TeacherDto> findAll();

    void delete(Long id);

}
