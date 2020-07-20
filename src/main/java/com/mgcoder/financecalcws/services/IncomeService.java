package com.mgcoder.financecalcws.services;

import com.mgcoder.financecalcws.entities.Income;
import com.mgcoder.financecalcws.repositories.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IncomeService implements FinanceService<Income, Integer> {
    @Autowired
    private IncomeRepository incomeRepository;

    public List<Income> getAll() {
        List<Income> incomes = new ArrayList<>();
        incomeRepository.findAll().forEach(incomes::add);
        return incomes;
    }

    public Income getById(Integer id) {
        return incomeRepository.findById(id).get();
    }

    public void update(Integer id, Income income) {
        if(incomeRepository.existsById(id))
            incomeRepository.save(income);
    }

    public void delete(Integer id) {
        incomeRepository.deleteById(id);
    }

    public void add(Income income) {
        if(!incomeRepository.existsById(income.getId()))
            incomeRepository.save(income);
    }
}
