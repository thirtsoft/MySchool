package com.school.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "cours")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cours implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reference", length = 30, unique = true)
    private String reference;

    @Column(name = "libelle", length = 50)
    private String libelle;

    @Column(name = "heureDebut", length = 50)
    private Date heureDebut;

    @Column(name = "heureFin", length = 50)
    private Date heureFin;

    @ManyToOne
    @JoinColumn(name = "matiereId")
    private Matiere matiere;

    @ManyToOne
    @JoinColumn(name = "classeId")
    private Classe classe;

    @ManyToOne
    @JoinColumn(name = "salleId")
    private Salle salle;

}
