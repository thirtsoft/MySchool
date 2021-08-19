package com.school.dtos;

import com.school.models.Observation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ObservationDto {

    private Long id;

    private String reference;

    private String libelle;

    private Date createdDate;

    private StudentDto studentDto;

    private EvaluationDto evaluationDto;

    public static ObservationDto fromEntityToDto(Observation observation) {
        if (observation == null) {
            return null;
        }

        return ObservationDto.builder()
                .id(observation.getId())
                .reference(observation.getReference())
                .libelle(observation.getLibelle())
                .createdDate(observation.getCreatedDate())
                .studentDto(StudentDto.fromEntityToDto(observation.getStudent()))
                .evaluationDto(EvaluationDto.fromEntityToDto(observation.getEvaluation()))
                .build();

    }

    public static Observation fromDtoToEntity(ObservationDto observationDto) {
        if (observationDto == null) {
            return null;
        }
        Observation observation = new Observation();
        observation.setId(observationDto.getId());
        observation.setReference(observationDto.getReference());
        observation.setLibelle(observationDto.getLibelle());
        observation.setCreatedDate(observationDto.getCreatedDate());
        observation.setStudent(StudentDto.fromDtoToEntity(observationDto.getStudentDto()));
        observation.setEvaluation(EvaluationDto.fromDtoToEntity(observationDto.getEvaluationDto()));

        return observation;
    }

}
