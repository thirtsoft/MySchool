package com.school.dtos;

import com.school.models.Salle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SalleDto {

    private Long id;

    private String reference;

    private String libelle;

    private int nombrePlace;

    private String etatSalle;

    private BatimentDto batimentDto;

    public static SalleDto fromEntityToDto(Salle salle) {
        if (salle == null) {
            return null;
        }

        return SalleDto.builder()
                .id(salle.getId())
                .reference(salle.getReference())
                .libelle(salle.getLibelle())
                .nombrePlace(salle.getNombrePlace())
                .etatSalle(salle.getEtatSalle())
                .batimentDto(BatimentDto.fromEntityToDto(salle.getBatiment()))
                .build();

    }

    public static Salle fromDtoToEntity(SalleDto salleDto) {
        if (salleDto == null) {
            return null;
        }
        Salle salle = new Salle();
        salle.setId(salleDto.getId());
        salle.setReference(salleDto.getReference());
        salle.setLibelle(salleDto.getLibelle());
        salle.setNombrePlace(salleDto.getNombrePlace());
        salle.setEtatSalle(salleDto.getEtatSalle());
        salle.setBatiment(BatimentDto.fromDtoToEntity(salleDto.getBatimentDto()));

        return salle;
    }

}
