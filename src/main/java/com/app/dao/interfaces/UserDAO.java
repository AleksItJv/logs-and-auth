package com.app.dao.interfaces;

import com.app.entities.User;

import java.util.List;

public interface UserDAO {

    User addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    User getUserByEmail(String eamil);

    List<User> getUsersByLogin(String login);

    User deleteUser(User user);

}
