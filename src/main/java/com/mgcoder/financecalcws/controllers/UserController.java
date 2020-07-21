package com.mgcoder.financecalcws.controllers;

import com.mgcoder.financecalcws.entities.User;
import com.mgcoder.financecalcws.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users/r")
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @RequestMapping("/users/r/{id}")
    public User getUserById(@NonNull @PathVariable Integer id) {
        return userService.getById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/u/{id}")
    public void updateUser(@NonNull @PathVariable Integer id, @RequestBody User user) {
        user.setId(id);
        userService.update(id, user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/d/{id}")
    public void deleteUser(@NonNull @PathVariable Integer id) {
        userService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users/c")
    public void addUser(@RequestBody User user) {
        userService.add(user);
    }
}
