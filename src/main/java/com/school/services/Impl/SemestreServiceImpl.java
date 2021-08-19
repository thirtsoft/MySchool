package com.school.services.Impl;

import com.school.dtos.SemestreDto;
import com.school.repository.SemestreRepository;
import com.school.services.SemestreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class SemestreServiceImpl implements SemestreService {

    private final SemestreRepository semestreRepository;

    @Override
    public SemestreDto save(SemestreDto semestreDto) {
        return null;
    }

    @Override
    public SemestreDto update(Long idAddress, SemestreDto semestreDto) {
        return null;
    }

    @Override
    public SemestreDto findById(Long id) {
        return null;
    }

    @Override
    public List<SemestreDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
