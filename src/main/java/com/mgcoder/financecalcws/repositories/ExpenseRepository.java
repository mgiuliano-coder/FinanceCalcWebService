package com.mgcoder.financecalcws.repositories;

import com.mgcoder.financecalcws.entities.Expense;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<Expense, Integer> {
}
