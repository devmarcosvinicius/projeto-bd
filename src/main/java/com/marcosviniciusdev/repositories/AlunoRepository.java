package com.marcosviniciusdev.repositories;

import com.marcosviniciusdev.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {}
