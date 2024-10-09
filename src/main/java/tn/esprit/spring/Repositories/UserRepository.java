package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.Entities.User;
public interface UserRepository extends JpaRepository<User, Integer> {
}
