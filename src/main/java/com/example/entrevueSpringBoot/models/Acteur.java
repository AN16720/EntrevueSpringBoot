package com.example.entrevueSpringBoot.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Acteur {

    @Id
    @GeneratedValue
    @Getter @Setter private int id;
    @Getter @Setter private String nom;
    @Getter @Setter private String prenom;

    public Acteur() {
    }

    public Acteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
