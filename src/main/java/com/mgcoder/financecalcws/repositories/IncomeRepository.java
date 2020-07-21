package com.mgcoder.financecalcws.repositories;

import com.mgcoder.financecalcws.entities.Asset;
import com.mgcoder.financecalcws.entities.Income;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface IncomeRepository extends CrudRepository<Income, Integer> {

    @Query("SELECT i FROM Income i WHERE i.userId = :userId")
    public Iterable<Income> findAll(@NonNull @Param("userId") Integer userId);

    @Query("SELECT i FROM Income i WHERE i.id = :id and i.userId = :userId")
    public Optional<Income> findById(@NonNull @Param("id")Integer id, @NonNull @Param("userId") Integer userId);
}
