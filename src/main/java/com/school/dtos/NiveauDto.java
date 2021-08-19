package com.school.dtos;

import com.school.models.Absence;
import com.school.models.Niveau;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NiveauDto {

    private Long id;

    private String reference;

    private String designation;

    public static NiveauDto fromEntityToDto(Niveau niveau) {
        if (niveau == null) {
            return null;
        }

        return NiveauDto.builder()
                .id(niveau.getId())
                .reference(niveau.getReference())
                .designation(niveau.getDesignation())
                .build();

    }

    public static Niveau fromDtoToEntity(NiveauDto niveauDto) {
        if (niveauDto == null) {
            return null;
        }
        Niveau niveau = new Niveau();
        niveau.setId(niveauDto.getId());
        niveau.setReference(niveauDto.getReference());
        niveau.setDesignation(niveauDto.getDesignation());

        return niveau;
    }

}
