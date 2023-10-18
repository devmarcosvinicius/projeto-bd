package com.marcosviniciusdev.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ra;
    private String nome;
    private String sobrenome;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data_nascimento;

    @Column(unique = true)
    private String cpf;
    private String rg;
    private String bairro;
    private String rua;
    private String quadra;
    private String numero;
    private String cep;
    private String uf;
    private String nome_pai;
    private String nome_mae;

    @ManyToOne
    private Curso curso;

    @ManyToOne
    private Sexo sexo;

    @ManyToOne
    private Status status;



}
