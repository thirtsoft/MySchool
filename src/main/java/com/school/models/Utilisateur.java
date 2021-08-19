package com.school.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "utilisateur")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reference", length = 50)
    private String reference;

    @Column(name = "firstName", length = 90)
    private String firstName;

    @Column(name = "lastName", length = 70)
    private String lastName;

    @Column(name = "mobile", length = 70)
    private String mobile;

    @Column(name = "email", length = 50)
    private String email;

    @ManyToOne
    private Role role;

}
