package com.school.services.Impl;

import com.school.dtos.NiveauDto;
import com.school.repository.NiveauRepository;
import com.school.services.NiveauService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class NiveauServiceImpl implements NiveauService {

    private final NiveauRepository niveauRepository;

    @Override
    public NiveauDto save(NiveauDto niveauDto) {
        return null;
    }

    @Override
    public NiveauDto update(Long idAddress, NiveauDto niveauDto) {
        return null;
    }

    @Override
    public NiveauDto findById(Long id) {
        return null;
    }

    @Override
    public List<NiveauDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
