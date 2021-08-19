package com.school.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "evaluation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evaluation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reference", length = 30, unique = true)
    private String reference;

    @Column(name = "libelle", length = 50)
    private String libelle;

    @Column(name = "epreuve", length = 50)
    private String epreuve;

    @Column(name = "note1", length = 50)
    private double note1;

    @Column(name = "note2", length = 50)
    private double note2;

    @Column(name = "noteExam", length = 50)
    private double noteExam;

    @Column(name = "dateEvaluation", length = 50)
    private Date dateEvaluation;

    @ManyToOne
    @JoinColumn(name = "teacherId")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "matiereId")
    private Matiere matiere;

}
