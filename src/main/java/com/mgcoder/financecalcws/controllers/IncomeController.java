package com.mgcoder.financecalcws.controllers;

import com.mgcoder.financecalcws.entities.Income;
import com.mgcoder.financecalcws.services.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IncomeController {
    @Autowired
    private IncomeService incomeService;

    @RequestMapping("/incomes/r/{userId}")
    public List<Income> getAll(@NonNull @PathVariable Integer userId) {
        return incomeService.getAll(userId);
    }

    @RequestMapping("/incomes/r/{id}/{userId}")
    public Income getById(@NonNull @PathVariable Integer id, @NonNull @PathVariable Integer userId) {
        return incomeService.getById(id, userId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/incomes/u/{id}")
    public void update(@NonNull @PathVariable Integer id, @RequestBody Income income) {
        income.setId(id);
        incomeService.update(id, income);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/incomes/d/{id}")
    public void delete(@NonNull @PathVariable Integer id) {
        incomeService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/incomes/c")
    public void add(@RequestBody Income income) {
        incomeService.add(income);
    }
}
