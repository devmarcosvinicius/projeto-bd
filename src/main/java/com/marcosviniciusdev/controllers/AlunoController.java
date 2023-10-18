package com.marcosviniciusdev.controllers;

import com.marcosviniciusdev.models.Aluno;
import com.marcosviniciusdev.repositories.AlunoRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> getAlunos() {
        return this.alunoRepository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Aluno> create(@RequestBody Aluno aluno) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.alunoRepository.save(aluno));
    }

}
