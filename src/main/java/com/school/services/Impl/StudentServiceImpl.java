package com.school.services.Impl;

import com.school.dtos.StudentDto;
import com.school.repository.StudentRepository;
import com.school.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public StudentDto save(StudentDto StudentDto) {
        return null;
    }

    @Override
    public StudentDto update(Long idStudent, StudentDto studentDto) {
        return null;
    }

    @Override
    public StudentDto saveStudentWithFiles(String studentDto, MultipartFile photoStudent) throws IOException {
        return null;
    }

    @Override
    public StudentDto findById(Long id) {
        return null;
    }

    @Override
    public StudentDto findByReference(String reference) {
        return null;
    }

    @Override
    public List<StudentDto> findAll() {
        return null;
    }

    @Override
    public List<StudentDto> findListStudentByPermis(Long pId) {
        return null;
    }

    @Override
    public List<StudentDto> findListStudentByKeyword(String keyword) {
        return null;
    }

    @Override
    public List<StudentDto> findStudentByDisponibility(String disponility) {
        return null;
    }

    @Override
    public BigDecimal countNumbersOfStudents() {
        return null;
    }

    @Override
    public Page<StudentDto> findStudentByPageable(Pageable pageable) {
        return null;
    }

    @Override
    public Page<StudentDto> findStudentByKeywordByPageable(String mc, Pageable pageable) {
        return null;
    }

    @Override
    public Page<StudentDto> findStudentByLocalityPageables(Long addId, Pageable pageable) {
        return null;
    }

    @Override
    public Page<StudentDto> findStudentByPermisPageables(Long permisId, Pageable pageable) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
