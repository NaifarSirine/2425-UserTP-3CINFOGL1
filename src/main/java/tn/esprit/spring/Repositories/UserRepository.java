package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Sexe;
import tn.esprit.spring.Entities.User;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    //select u from User u where u.nom=...
    List<User> findByNom(String nom);

    //select u from User u where u.sexe=...
    List<User> findBySexe(Sexe sexe);

    // select u from User u where u.nom=... & u.prenom=
    List<User> findByNomAndPrenom(String nom,String prenom);

    // select u from User u where u.nom=... || u.prenom=
    List<User> findByNomOrPrenom(String nom,String prenom);

    // select u from User u where u.dateNaissance between ... and ...
    List<User> getByDateNaissanceBetween(LocalDate date1, LocalDate date2);

    // select u from User u where u.id > ...
    List<User> findByIdGreaterThan(long number);

    // select u from User u where u.id < ...
    List<User> findByIdLessThan(long number);

    // select u from User u where u.nom like .....
    List<User> findByNomLike(String nom);
    List<User> findByNomContaining(String nom);
    List<User> findByNomContains(String nom);

    // Accepte les noms en majus et en mini
    List<User> findByNomIgnoreCase(String nom);
}
