package com.marcosviniciusdev.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String valor_contato;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private TipoContato tipo_contato;

}
