package com.school.services.Impl;

import com.school.dtos.InscriptionDto;
import com.school.repository.InscriptionRepository;
import com.school.services.InscriptionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class InscriptionServiceImpl implements InscriptionService {

    private final InscriptionRepository inscriptionRepository;

    @Override
    public InscriptionDto save(InscriptionDto inscriptionDto) {
        return null;
    }

    @Override
    public InscriptionDto update(Long idAddress, InscriptionDto inscriptionDto) {
        return null;
    }

    @Override
    public InscriptionDto findById(Long id) {
        return null;
    }

    @Override
    public List<InscriptionDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
