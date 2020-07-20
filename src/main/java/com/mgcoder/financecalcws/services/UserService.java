package com.mgcoder.financecalcws.services;

import com.mgcoder.financecalcws.entities.User;
import com.mgcoder.financecalcws.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService implements FinanceService<User, Integer> {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public User getById(Integer id) {
        return userRepository.findById(id).get();
    }

    public void update(Integer id, User user) {
        if(userRepository.existsById(id))
            userRepository.save(user);
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    public void add(User user) {
        if(!userRepository.existsById(user.getId()))
            userRepository.save(user);
    }
}
