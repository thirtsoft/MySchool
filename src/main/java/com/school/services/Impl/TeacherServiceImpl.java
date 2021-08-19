package com.school.services.Impl;

import com.school.dtos.TeacherDto;
import com.school.repository.TeacherRepository;
import com.school.services.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;
    
    @Override
    public TeacherDto save(TeacherDto teacherDto) {
        return null;
    }

    @Override
    public TeacherDto update(Long idAddress, TeacherDto teacherDto) {
        return null;
    }

    @Override
    public TeacherDto findById(Long id) {
        return null;
    }

    @Override
    public List<TeacherDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
