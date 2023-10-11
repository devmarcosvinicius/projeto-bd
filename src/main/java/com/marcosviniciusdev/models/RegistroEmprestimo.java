package com.marcosviniciusdev.models;

import java.util.Date;

public class RegistroEmprestimo {

    private int id;
    private Date data_emprestimo;
    private Date data_devolucao;

    private Aluno aluno;

    private Exemplar exemplar;

    private StatusEmprestimo status_emprestimo;

}
