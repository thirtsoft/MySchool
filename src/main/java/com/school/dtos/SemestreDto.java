package com.school.dtos;

import com.school.models.Semestre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SemestreDto {

    private Long id;

    private String reference;

    private String designation;

    public static SemestreDto fromEntityToDto(Semestre semestre) {
        if (semestre == null) {
            return null;
        }

        return SemestreDto.builder()
                .id(semestre.getId())
                .reference(semestre.getReference())
                .designation(semestre.getDesignation())
                .build();

    }

    public static Semestre fromDtoToEntity(SemestreDto semestreDto) {
        if (semestreDto == null) {
            return null;
        }
        Semestre semestre = new Semestre();
        semestre.setId(semestreDto.getId());
        semestre.setReference(semestreDto.getReference());
        semestre.setDesignation(semestreDto.getReference());

        return semestre;
    }

}
