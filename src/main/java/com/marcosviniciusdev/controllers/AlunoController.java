package com.marcosviniciusdev.controllers;

import com.marcosviniciusdev.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    @Autowired
    AlunoRepository alunoRepository;

    

}
