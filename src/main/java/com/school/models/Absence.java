package com.school.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "absence")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Absence implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reference", length = 50)
    private String reference;

    @Column(name = "designation", length = 90)
    private String designation;

    @Column(name = "motif", length = 90)
    private String motif;

    @Column(name = "etat", length = 90)
    private String etat;

    @Column(name = "createdDate", length = 90)
    private Date createdDate;

    @Column(name = "retourDate")
    private Date retourDate;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;


}
