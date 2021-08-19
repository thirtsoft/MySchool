package com.school.dtos;

import com.school.models.Absence;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AbsenceDto {

    private Long id;

    private String reference;

    private String designation;

    private String motif;

    private String etat;

    private Date createdDate;

    private Date retourDate;

    private StudentDto studentDto;

    public static AbsenceDto fromEntityToDto(Absence absence) {
        if (absence == null) {
            return null;
        }

        return AbsenceDto.builder()
                .id(absence.getId())
                .reference(absence.getReference())
                .designation(absence.getDesignation())
                .motif(absence.getMotif())
                .etat(absence.getEtat())
                .createdDate(absence.getCreatedDate())
                .retourDate(absence.getRetourDate())
                .studentDto(StudentDto.fromEntityToDto(absence.getStudent()))

                .build();

    }

    public static Absence fromDtoToEntity(AbsenceDto absenceDto) {
        if (absenceDto == null) {
            return null;
        }
        Absence absence = new Absence();
        absence.setId(absenceDto.getId());
        absence.setReference(absenceDto.getReference());
        absence.setDesignation(absenceDto.getDesignation());
        absence.setEtat(absenceDto.getEtat());
        absence.setCreatedDate(absenceDto.getCreatedDate());
        absence.setRetourDate(absenceDto.getRetourDate());
        absence.setStudent(StudentDto.fromDtoToEntity(absenceDto.getStudentDto()));

        return absence;
    }


}
