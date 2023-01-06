package org.iesfm.examen.rest.dao;

import org.iesfm.examen.rest.entity.User;

import java.util.List;

public interface UserDAO {

    boolean existUser(int userId);
    List<User> listUsers(String country);
    boolean addUser(User user);

}
