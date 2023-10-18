package com.marcosviniciusdev.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class LivroExemplar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Livro livro;

    @ManyToOne
    private Exemplar exemplar;

}
