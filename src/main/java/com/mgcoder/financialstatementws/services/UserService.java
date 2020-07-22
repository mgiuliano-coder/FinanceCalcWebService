package com.mgcoder.financialstatementws.services;

import com.mgcoder.financialstatementws.entities.User;
import com.mgcoder.financialstatementws.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public User getById(@NonNull Integer id) {
        return userRepository.findById(id).get();
    }

    public void update(@NonNull Integer id, User user) {
        if(userRepository.existsById(id))
            userRepository.save(user);
    }

    public void delete(@NonNull Integer id) {
        userRepository.deleteById(id);
    }

    public void add(User user) {
        if(!userRepository.existsById(user.getId()))
            userRepository.save(user);
    }
}
