package tn.esprit.spring.Services;

import tn.esprit.spring.Entities.User;

import java.util.List;

public interface IUserService {
    User add(User user);
    List<User> addAll(List<User> users);
    User update(User user);
    List<User> updateAll(List<User> users);
    User selectById(int id);
    List<User> selectAll();
    void delete(User user);
    void deleteById(int id);
    void deleteAll(List<User> users);
    void deleteAll();
    long count();
}
