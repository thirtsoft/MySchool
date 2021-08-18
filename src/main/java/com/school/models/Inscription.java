package com.school.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "inscription")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inscription implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reference", length = 30, unique = true)
    private String reference;

    @Column(name = "annee", length = 50)
    private String annee;

    @Column(name = "createdDate", length = 30)
    private Date createdDate;

    @Column(name = "montant", length = 80)
    private double montant;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "classeId")
    private Classe classe;
}
