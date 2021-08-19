package com.school.services.Impl;

import com.school.dtos.ClasseDto;
import com.school.repository.ClasseRepository;
import com.school.services.ClasseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ClasseServiceImpl implements ClasseService {

    private final ClasseRepository classeRepository;

    @Override
    public ClasseDto save(ClasseDto classeDto) {
        return null;
    }

    @Override
    public ClasseDto update(Long idAddress, ClasseDto classeDto) {
        return null;
    }

    @Override
    public ClasseDto findById(Long id) {
        return null;
    }

    @Override
    public List<ClasseDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
