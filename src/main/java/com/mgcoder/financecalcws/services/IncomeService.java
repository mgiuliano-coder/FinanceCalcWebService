package com.mgcoder.financecalcws.services;

import com.mgcoder.financecalcws.entities.Income;
import com.mgcoder.financecalcws.repositories.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IncomeService implements FinanceService<Income, Integer> {
    @Autowired
    private IncomeRepository incomeRepository;

    public List<Income> getAll(@NonNull Integer userId) {
        List<Income> incomes = new ArrayList<>();
        incomeRepository.findAll(userId).forEach(incomes::add);
        return incomes;
    }

    public Income getById(@NonNull Integer id, @NonNull Integer userId) {
        return incomeRepository.findById(id, userId).get();
    }

    public void update(@NonNull Integer id, Income income) {
        if(incomeRepository.existsById(id))
            incomeRepository.save(income);
    }

    public void delete(@NonNull Integer id) {
        incomeRepository.deleteById(id);
    }

    public void add(Income income) {
        if(!incomeRepository.existsById(income.getId()))
            incomeRepository.save(income);
    }
}
