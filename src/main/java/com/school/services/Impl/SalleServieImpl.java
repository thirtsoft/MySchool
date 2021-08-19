package com.school.services.Impl;

import com.school.dtos.SalleDto;
import com.school.repository.SalleRepository;
import com.school.services.SalleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class SalleServieImpl implements SalleService {

    private final SalleRepository salleRepository;

    @Override
    public SalleDto save(SalleDto salleDto) {
        return null;
    }

    @Override
    public SalleDto update(Long idAddress, SalleDto salleDto) {
        return null;
    }

    @Override
    public SalleDto findById(Long id) {
        return null;
    }

    @Override
    public List<SalleDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
