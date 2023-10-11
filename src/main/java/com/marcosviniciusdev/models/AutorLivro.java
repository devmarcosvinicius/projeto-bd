package com.marcosviniciusdev.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AutorLivro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Autor autor;

    private Livro livro;

}
