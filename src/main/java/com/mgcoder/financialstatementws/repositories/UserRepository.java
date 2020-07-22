package com.mgcoder.financecalcws.repositories;

import com.mgcoder.financecalcws.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
