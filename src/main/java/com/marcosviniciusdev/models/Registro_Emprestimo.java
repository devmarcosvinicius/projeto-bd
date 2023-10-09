package com.marcosviniciusdev.models;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;

import java.util.Date;

public class Registro_Emprestimo {

    private int id;
    private Date data_emprestimo;
    private Date data_devolucao;

    private Aluno aluno;

    private Exemplar exemplar;

    private Status_Emprestimo status_emprestimo;

}
