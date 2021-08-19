package com.school.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "teacher")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Surveillant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cni", length = 50)
    private String cni;

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

    @Column(name = "phoneSurveillant", length = 30)
    private String phoneSurveillant;

    @Column(name = "diplome", length = 30)
    private String diplome;

    @Column(name = "dateEmbauche", length = 30)
    private Data dateEmbauche;

}
