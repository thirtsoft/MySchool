package com.school.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "matiere")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Matiere implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reference", length = 30, unique = true)
    private String reference;

    @Column(name = "libelle", length = 50)
    private String libelle;

    @Column(name = "coefficient", length = 15)
    private int coefficient;

    @Column(name = "nombreHeure", length = 15)
    private String nombreHeure;

    @ManyToOne
    @JoinColumn(name = "niveauId")
    private Niveau niveau;


}
