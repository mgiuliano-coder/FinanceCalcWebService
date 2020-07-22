package com.mgcoder.financecalcws.repositories;

import com.mgcoder.financecalcws.entities.Asset;
import com.mgcoder.financecalcws.entities.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

    @Query("SELECT c FROM Category c WHERE c.userId = :userId")
    public Iterable<Category> findAll(@NonNull @Param("userId") Integer userId);

    @Query("SELECT c FROM Category c WHERE c.id = :id and c.userId = :userId")
    public Optional<Category> findById(@NonNull @Param("id")Integer id, @NonNull @Param("userId") Integer userId);
}
