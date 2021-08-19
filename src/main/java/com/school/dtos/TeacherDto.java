package com.school.dtos;

import com.school.models.Teacher;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {

    private Long id;

    private String cni;

    private String firstName;

    private String lastName;

    private String sexe;

    private String addressActuel;

    private String email;

    private String phoneTeacher;

    private String diplome;

    private Data dateEmbauche;

    public static TeacherDto fromEntityToDto(Teacher teacher) {
        if (teacher == null) {
            return null;
        }

        return TeacherDto.builder()
                .id(teacher.getId())
                .cni(teacher.getCni())
                .firstName(teacher.getFirstName())
                .lastName(teacher.getLastName())
                .sexe(teacher.getSexe())
                .addressActuel(teacher.getAddressActuel())
                .email(teacher.getEmail())
                .phoneTeacher(teacher.getPhoneTeacher())
                .diplome(teacher.getDiplome())
                .dateEmbauche(teacher.getDateEmbauche())
                .build();

    }

    public static Teacher fromDtoToEntity(TeacherDto teacherDto) {
        if (teacherDto == null) {
            return null;
        }
        Teacher teacher = new Teacher();
        teacher.setId(teacherDto.getId());
        teacher.setCni(teacherDto.getCni());
        teacher.setFirstName(teacherDto.getFirstName());
        teacher.setLastName(teacherDto.getLastName());
        teacher.setSexe(teacherDto.getSexe());
        teacher.setAddressActuel(teacherDto.getAddressActuel());
        teacher.setEmail(teacherDto.getEmail());
        teacher.setPhoneTeacher(teacherDto.getPhoneTeacher());
        teacher.setDateEmbauche(teacherDto.getDateEmbauche());

        return teacher;
    }


}
