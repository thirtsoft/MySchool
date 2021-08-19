package com.school.dtos;

import com.school.models.Classe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClasseDto {

    private Long id;

    private String reference;

    private String libelle;

    private int nombreEleve;

    public static ClasseDto fromEntityToDto(Classe classe) {
        if (classe == null) {
            return null;
        }

        return ClasseDto.builder()
                .id(classe.getId())
                .reference(classe.getReference())
                .libelle(classe.getLibelle())
                .nombreEleve(classe.getNombreEleve())
                .build();

    }

    public static Classe fromDtoToEntity(ClasseDto classeDto) {
        if (classeDto == null) {
            return null;
        }
        Classe classe = new Classe();
        classe.setId(classeDto.getId());
        classe.setReference(classeDto.getReference());
        classe.setLibelle(classeDto.getLibelle());
        classe.setNombreEleve(classeDto.getNombreEleve());

        return classe;
    }

}
