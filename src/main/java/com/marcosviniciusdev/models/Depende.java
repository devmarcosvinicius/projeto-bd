package com.marcosviniciusdev.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Depende {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Disciplina disciplina;

}
