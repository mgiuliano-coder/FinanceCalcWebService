package com.mgcoder.financecalcws.services;

import com.mgcoder.financecalcws.entities.Expense;
import com.mgcoder.financecalcws.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseService implements FinanceService<Expense, Integer> {
    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAll(@NonNull Integer userId) {
        List<Expense> expenses = new ArrayList<>();
        expenseRepository.findAll(userId).forEach(expenses::add);
        return expenses;
    }

    public Expense getById(@NonNull Integer id, @NonNull Integer userId) {
        return expenseRepository.findById(id, userId).get();
    }

    public void update(@NonNull Integer id, Expense expense) {
        if(expenseRepository.existsById(id))
            expenseRepository.save(expense);
    }

    public void delete(@NonNull Integer id) {
        expenseRepository.deleteById(id);
    }

    public void add(Expense expense) {
        if(!expenseRepository.existsById(expense.getId()))
            expenseRepository.save(expense);
    }
}
