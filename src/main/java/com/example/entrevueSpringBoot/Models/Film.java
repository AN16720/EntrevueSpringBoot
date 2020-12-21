package com.example.entrevueSpringBoot.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
public class Film {

    @Id
    @GeneratedValue
    @Getter @Setter private long id;
    @Getter @Setter private String titre;
    @Getter @Setter private String description;
    @OneToMany(targetEntity=Acteur.class, cascade = {CascadeType.ALL})
    @Getter @Setter private List<Acteur> acteurs;

    public Film() {
    }

    public Film(String titre, String description, List<Acteur> acteurs) {
        this.titre = titre;
        this.description = description;
        this.acteurs = acteurs;
    }
}
