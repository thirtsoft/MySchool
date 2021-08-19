package com.school.services.Impl;

import com.school.dtos.CoursDto;
import com.school.repository.CoursRepository;
import com.school.services.CoursService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CoursServiceImpl implements CoursService {

    private final CoursRepository coursRepository;

    @Override
    public CoursDto save(CoursDto coursDto) {
        return null;
    }

    @Override
    public CoursDto update(Long idAddress, CoursDto coursDto) {
        return null;
    }

    @Override
    public CoursDto findById(Long id) {
        return null;
    }

    @Override
    public List<CoursDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
