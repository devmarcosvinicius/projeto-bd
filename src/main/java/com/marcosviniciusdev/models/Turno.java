package com.marcosviniciusdev.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String nome;

}
