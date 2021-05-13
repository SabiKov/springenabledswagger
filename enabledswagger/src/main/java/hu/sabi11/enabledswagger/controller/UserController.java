package hu.sabi11.enabledswagger.controller;


import hu.sabi11.enabledswagger.model.User;
import hu.sabi11.enabledswagger.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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

    @ApiOperation(value = "Add user to DB by User object",
            notes = "Provide an User object in order to save into DB",
            response = User.class)

    @PostMapping
    public User addUser(@RequestBody User user) {
        return service.addUser(user);

    }

    @GetMapping
    public List<User> getUsers(@ApiParam(value = "do not need any param to retrieve all users objects", required = true)
                               @PathVariable String id) {
        return service.getUsers();
    }

    @DeleteMapping("/id")
    public User deleteUser(@PathVariable Long userId) {
        return service.deleteUser(userId);

    }

}
