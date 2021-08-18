package com.school.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reference", length = 50)
    private String reference;

    @Column(name = "firstName", length = 90)
    private String firstName;

    @Column(name = "lastName", length = 70)
    private String lastName;

    @Column(name = "sexe", length = 70)
    private String sexe;

    @Column(name = "addressActuel", length = 90)
    private String addressActuel;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "phoneStudent", length = 30)
    private String phoneStudent;

    @Column(name = "photoStudent", length = 30)
    private String photoStudent;

}
