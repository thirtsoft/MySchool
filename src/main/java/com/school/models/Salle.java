package com.school.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "salle")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reference", length = 30, unique = true)
    private String reference;

    @Column(name = "libelle", length = 50)
    private String libelle;

    @Column(name = "nombreSalle", length = 20)
    private int nombrePlace;

    @Column(name = "etatSalle", length = 20)
    private String etatSalle;

    @ManyToOne
    @JoinColumn(name = "batimentId")
    private Batiment batiment;

}
