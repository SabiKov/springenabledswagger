package hu.sabi11.enabledswagger.controller;


import hu.sabi11.enabledswagger.model.User;
import hu.sabi11.enabledswagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return service.addUser(user);

    }

    @GetMapping
    public List<User> getUsers() {
        return service.getUsers();
    }

    @DeleteMapping("/id")
    public User deleteUser(@PathVariable Long userId) {
        return service.deleteUser(userId);

    }

}
