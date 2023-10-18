package com.marcosviniciusdev.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ProfessorLaboratorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Professor professor;

    @ManyToOne
    private Laboratorio laboratorio;

}
