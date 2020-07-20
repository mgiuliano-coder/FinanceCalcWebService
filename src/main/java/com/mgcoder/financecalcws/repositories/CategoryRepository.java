package com.mgcoder.financecalcws.repositories;

import com.mgcoder.financecalcws.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
