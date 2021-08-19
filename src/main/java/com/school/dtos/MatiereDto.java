package com.school.dtos;

import com.school.models.Matiere;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatiereDto {

    private Long id;

    private String reference;

    private String libelle;

    private int coefficient;

    private String nombreHeure;

    private NiveauDto niveauDto;

    public static MatiereDto fromEntityToDto(Matiere matiere) {
        if (matiere == null) {
            return null;
        }

        return MatiereDto.builder()
                .id(matiere.getId())
                .reference(matiere.getReference())
                .libelle(matiere.getLibelle())
                .coefficient(matiere.getCoefficient())
                .nombreHeure(matiere.getNombreHeure())
                .niveauDto(NiveauDto.fromEntityToDto(matiere.getNiveau()))
                .build();

    }

    public static Matiere fromDtoToEntity(MatiereDto matiereDto) {
        if (matiereDto == null) {
            return null;
        }
        Matiere matiere = new Matiere();
        matiere.setId(matiereDto.getId());
        matiere.setReference(matiereDto.getReference());
        matiere.setLibelle(matiereDto.getLibelle());
        matiere.setCoefficient(matiereDto.getCoefficient());
        matiere.setNombreHeure(matiereDto.getNombreHeure());
        matiere.setNiveau(NiveauDto.fromDtoToEntity(matiereDto.getNiveauDto()));

        return matiere;
    }

}
