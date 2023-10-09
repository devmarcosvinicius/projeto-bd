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
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String valor_contato;

    @ManyToOne
    @JoinColumn(name = "id")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "id")
    private Tipo_Contato tipo_contato;

}
