package com.school.dtos;

import com.school.models.Absence;
import com.school.models.Cours;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CoursDto {

    private Long id;

    private String reference;

    private String libelle;

    private Date heureDebut;

    private Date heureFin;

    private MatiereDto matiereDto;

    private ClasseDto classeDto;

    private SalleDto salleDto;

    public static CoursDto fromEntityToDto(Cours cours) {
        if (cours == null) {
            return null;
        }

        return CoursDto.builder()
                .id(cours.getId())
                .reference(cours.getReference())
                .libelle(cours.getLibelle())
                .heureDebut(cours.getHeureDebut())
                .heureFin(cours.getHeureFin())
                .matiereDto(MatiereDto.fromEntityToDto(cours.getMatiere()))
                .classeDto(ClasseDto.fromEntityToDto(cours.getClasse()))
                .salleDto(SalleDto.fromEntityToDto(cours.getSalle()))
                .build();

    }

    public static Cours fromDtoToEntity(CoursDto coursDto) {
        if (coursDto == null) {
            return null;
        }
        Cours cours = new Cours();
        cours.setId(coursDto.getId());
        cours.setReference(coursDto.getReference());
        cours.setLibelle(coursDto.getLibelle());
        cours.setHeureDebut(coursDto.getHeureDebut());
        cours.setHeureFin(coursDto.getHeureFin());
        cours.setMatiere(MatiereDto.fromDtoToEntity(coursDto.getMatiereDto()));
        cours.setClasse(ClasseDto.fromDtoToEntity(coursDto.getClasseDto()));
        cours.setSalle(SalleDto.fromDtoToEntity(coursDto.getSalleDto()));

        return cours;
    }


}
