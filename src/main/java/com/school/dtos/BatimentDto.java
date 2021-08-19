package com.school.dtos;

import com.school.models.Batiment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BatimentDto {

    private Long id;

    private String reference;

    private String libelle;

    private int nombreSalle;

    public static BatimentDto fromEntityToDto(Batiment batiment) {
        if (batiment == null) {
            return null;
        }

        return BatimentDto.builder()
                .id(batiment.getId())
                .reference(batiment.getReference())
                .libelle(batiment.getLibelle())
                .nombreSalle(batiment.getNombreSalle())
                .build();

    }

    public static Batiment fromDtoToEntity(BatimentDto batimentDto) {
        if (batimentDto == null) {
            return null;
        }
        Batiment batiment = new Batiment();
        batiment.setId(batimentDto.getId());
        batiment.setReference(batimentDto.getReference());
        batiment.setLibelle(batimentDto.getLibelle());
        batiment.setNombreSalle(batimentDto.getNombreSalle());

        return batiment;
    }

}
