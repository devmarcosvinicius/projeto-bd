package com.marcosviniciusdev.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String descricao;

}
