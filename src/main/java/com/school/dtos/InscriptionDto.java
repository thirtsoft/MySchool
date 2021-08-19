package com.school.dtos;

import com.school.models.Absence;
import com.school.models.Inscription;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InscriptionDto {

    private Long id;

    private String reference;

    private String annee;

    private Date createdDate;

    private double montant;

    private StudentDto studentDto;

    private ClasseDto classeDto;

    public static InscriptionDto fromEntityToDto(Inscription inscription) {
        if (inscription == null) {
            return null;
        }

        return InscriptionDto.builder()
                .id(inscription.getId())
                .reference(inscription.getReference())
                .annee(inscription.getAnnee())
                .createdDate(inscription.getCreatedDate())
                .montant(inscription.getMontant())
                .studentDto(StudentDto.fromEntityToDto(inscription.getStudent()))
                .classeDto(ClasseDto.fromEntityToDto(inscription.getClasse()))
                .build();

    }

    public static Inscription fromDtoToEntity(InscriptionDto inscriptionDto) {
        if (inscriptionDto == null) {
            return null;
        }
        Inscription inscription = new Inscription();
        inscription.setId(inscriptionDto.getId());
        inscription.setReference(inscriptionDto.getReference());
        inscription.setAnnee(inscriptionDto.getAnnee());
        inscription.setCreatedDate(inscriptionDto.getCreatedDate());
        inscription.setMontant(inscriptionDto.getMontant());
        inscription.setStudent(StudentDto.fromDtoToEntity(inscriptionDto.getStudentDto()));
        inscription.setClasse(ClasseDto.fromDtoToEntity(inscriptionDto.getClasseDto()));

        return inscription;
    }

}
