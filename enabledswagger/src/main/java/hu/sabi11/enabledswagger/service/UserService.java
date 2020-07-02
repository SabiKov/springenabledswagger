package hu.sabi11.enabledswagger.service;

import hu.sabi11.enabledswagger.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    Map<Long, User> userMap = new HashMap<>();
    Long id = 1l;

    public User addUser(User user) {
        userMap.put(id++, user);
        return user;
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        userMap.entrySet().forEach(user -> {
            users.add(user.getValue());
        });
        return users;

    }

    public User deleteUser(Long userId) {
        return userMap.remove(userId);

    }
}
