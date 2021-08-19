package com.school.services.Impl;

import com.school.dtos.MatiereDto;
import com.school.repository.MatiereRepository;
import com.school.services.MatiereService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class MatiereServieImpl implements MatiereService {

    private final MatiereRepository matiereRepository;

    @Override
    public MatiereDto save(MatiereDto matiereDto) {
        return null;
    }

    @Override
    public MatiereDto update(Long idAddress, MatiereDto matiereDto) {
        return null;
    }

    @Override
    public MatiereDto findById(Long id) {
        return null;
    }

    @Override
    public List<MatiereDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
