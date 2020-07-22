package com.mgcoder.financialstatementws.repositories;

import com.mgcoder.financialstatementws.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
