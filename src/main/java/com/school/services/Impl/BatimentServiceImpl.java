package com.school.services.Impl;

import com.school.dtos.BatimentDto;
import com.school.repository.BatimentRepository;
import com.school.services.BatimentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class BatimentServiceImpl implements BatimentService {

    private final BatimentRepository batimentRepository;

    @Override
    public BatimentDto save(BatimentDto batimentDto) {
        return null;
    }

    @Override
    public BatimentDto update(Long idAddress, BatimentDto batimentDto) {
        return null;
    }

    @Override
    public BatimentDto findById(Long id) {
        return null;
    }

    @Override
    public List<BatimentDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
