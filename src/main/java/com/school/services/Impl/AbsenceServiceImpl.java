package com.school.services.Impl;

import com.school.dtos.AbsenceDto;
import com.school.repository.AbsenceRepository;
import com.school.services.AbsenceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class AbsenceServiceImpl implements AbsenceService {

    private final AbsenceRepository absenceRepository;

    @Override
    public AbsenceDto save(AbsenceDto absenceDto) {
        return null;
    }

    @Override
    public AbsenceDto update(Long idAddress, AbsenceDto absenceDto) {
        return null;
    }

    @Override
    public AbsenceDto findById(Long id) {
        return null;
    }

    @Override
    public List<AbsenceDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
