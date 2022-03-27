package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    void deleteById(int id);

    void update(int id, User user);

    User getUserById(int id);

    User getUserByUsername(String username);
}