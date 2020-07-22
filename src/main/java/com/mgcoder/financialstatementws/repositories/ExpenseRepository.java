package com.mgcoder.financecalcws.repositories;

import com.mgcoder.financecalcws.entities.Asset;
import com.mgcoder.financecalcws.entities.Expense;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface ExpenseRepository extends CrudRepository<Expense, Integer> {

    @Query("SELECT e FROM Expense e WHERE e.userId = :userId")
    public Iterable<Expense> findAll(@NonNull @Param("userId") Integer userId);

    @Query("SELECT e FROM Expense e WHERE e.id = :id and e.userId = :userId")
    public Optional<Expense> findById(@NonNull @Param("id")Integer id, @NonNull @Param("userId") Integer userId);
}
