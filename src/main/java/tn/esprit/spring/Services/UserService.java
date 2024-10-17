package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.User;
import tn.esprit.spring.Repositories.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    UserRepository userRepository;

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> addAll(List<User> users) {
        return userRepository.saveAll(users);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> updateAll(List<User> users) {
        return userRepository.saveAll(users);
    }

    @Override
    public User selectById(int id) {
        return userRepository.findById(id).get();
        // ou bien
        /*return userRepository.findById(id).orElse(User.builder()
                                                    .id(0)
                                                    .nom("test")
                                                    .prenom("test")
                                                    .build());*/
    }

    @Override
    public List<User> selectAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteAll(List<User> users) {
        userRepository.deleteAll(users);
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }

    @Override
    public long count() {
        return userRepository.count();
    }
}
