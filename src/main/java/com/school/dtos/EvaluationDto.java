package com.school.dtos;

import com.school.models.Evaluation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EvaluationDto {

    private Long id;

    private String reference;

    private String libelle;

    private String epreuve;

    private double note1;

    private double note2;

    private double noteExam;

    private Date dateEvaluation;

    private TeacherDto teacherDto;

    private MatiereDto matiereDto;

    public static EvaluationDto fromEntityToDto(Evaluation evaluation) {
        if (evaluation == null) {
            return null;
        }

        return EvaluationDto.builder()
                .id(evaluation.getId())
                .reference(evaluation.getReference())
                .libelle(evaluation.getLibelle())
                .epreuve(evaluation.getEpreuve())
                .note1(evaluation.getNote1())
                .note2(evaluation.getNote2())
                .noteExam(evaluation.getNoteExam())
                .dateEvaluation(evaluation.getDateEvaluation())
                .teacherDto(TeacherDto.fromEntityToDto(evaluation.getTeacher()))
                .matiereDto(MatiereDto.fromEntityToDto(evaluation.getMatiere()))
                .build();

    }

    public static Evaluation fromDtoToEntity(EvaluationDto evaluationDto) {
        if (evaluationDto == null) {
            return null;
        }
        Evaluation evaluation = new Evaluation();
        evaluation.setId(evaluationDto.getId());
        evaluation.setReference(evaluationDto.getReference());
        evaluation.setLibelle(evaluationDto.getLibelle());
        evaluation.setEpreuve(evaluationDto.getEpreuve());
        evaluation.setNote1(evaluationDto.getNote1());
        evaluation.setNote2(evaluationDto.getNote2());
        evaluation.setNoteExam(evaluationDto.getNoteExam());
        evaluation.setDateEvaluation(evaluationDto.getDateEvaluation());
        evaluation.setMatiere(MatiereDto.fromDtoToEntity(evaluationDto.getMatiereDto()));
        evaluation.setTeacher(TeacherDto.fromDtoToEntity(evaluationDto.getTeacherDto()));

        return evaluation;
    }


}
