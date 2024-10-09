package tn.esprit.spring.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "Utilisateur")
@Getter
@Setter
@NoArgsConstructor // Constructeur vide (Par défaut)
@AllArgsConstructor // Constructeur paramètré complet (Il contient tous les attributs)
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @Column(name = "identifiant")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT
    long id;

    @Column(nullable = false)
    String nom;

    @Column(nullable = false)
    String prenom;

    LocalDate dateNaissance;

    @Column(unique = true)
    String email;

    @Enumerated(EnumType.STRING)
    Sexe sexe;

    @Transient
    int age;

}
