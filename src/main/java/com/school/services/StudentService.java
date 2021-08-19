package com.school.services;

import com.school.dtos.StudentDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface StudentService {

    StudentDto save(StudentDto StudentDto);

    StudentDto update(Long idStudent, StudentDto studentDto);

    StudentDto saveStudentWithFiles(String studentDto,
                                    MultipartFile photoStudent)
            throws IOException;

    StudentDto findById(Long id);

    StudentDto findByReference(String reference);

    List<StudentDto> findAll();

    List<StudentDto> findListStudentByPermis(Long pId);

    List<StudentDto> findListStudentByKeyword(String keyword);

    List<StudentDto> findStudentByDisponibility(String disponility);

    BigDecimal countNumbersOfStudents();

    Page<StudentDto> findStudentByPageable(Pageable pageable);

    Page<StudentDto> findStudentByKeywordByPageable(String mc, Pageable pageable);


    Page<StudentDto> findStudentByLocalityPageables(Long addId, Pageable pageable);

    Page<StudentDto> findStudentByPermisPageables(@Param("permId") Long permisId, Pageable pageable);

    void delete(Long id);


}
