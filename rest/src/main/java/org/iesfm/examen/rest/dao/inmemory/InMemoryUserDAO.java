package org.iesfm.examen.rest.dao.inmemory;

import org.iesfm.examen.rest.dao.UserDAO;
import org.iesfm.examen.rest.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryUserDAO implements UserDAO {
    private Map<Integer, User> users = new HashMap<>();

    public InMemoryUserDAO() {
        users.put(1, new User(1, "Pocoyo", "Spain"));
        users.put(2, new User(2, "Peppa Pig", "France"));
    }

    @Override
    public boolean existUser(int userId) {
        return users.containsKey(userId);
    }

    @Override
    public List<User> listUsers(String country) {
        return users
                .values()
                .stream()
                .filter(user -> country == null || user.getCountry().equals(country))
                .collect(Collectors.toList());
    }

    @Override
    public boolean addUser(User user) {
        if (users.containsKey(user.getId())) {
            return false;
        } else {
            users.put(user.getId(), user);
            return true;
        }
    }
}
