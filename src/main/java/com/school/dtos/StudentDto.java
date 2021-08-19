package com.school.dtos;

import com.school.models.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private Long id;

    private String reference;

    private String firstName;

    private String lastName;

    private String sexe;

    private String addressActuel;

    private String email;

    private String phoneStudent;

    private String photoStudent;

    public static StudentDto fromEntityToDto(Student student) {
        if (student == null) {
            return null;
        }

        return StudentDto.builder()
                .id(student.getId())
                .reference(student.getReference())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .sexe(student.getSexe())
                .addressActuel(student.getAddressActuel())
                .email(student.getEmail())
                .phoneStudent(student.getPhoneStudent())
                .photoStudent(student.getPhotoStudent())
                .build();

    }

    public static Student fromDtoToEntity(StudentDto studentDto) {
        if (studentDto == null) {
            return null;
        }
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setReference(studentDto.getReference());
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setSexe(studentDto.getSexe());
        student.setAddressActuel(studentDto.getAddressActuel());
        student.setEmail(studentDto.getEmail());
        student.setPhoneStudent(studentDto.getPhoneStudent());
        student.setPhotoStudent(studentDto.getPhotoStudent());

        return student;
    }


}
