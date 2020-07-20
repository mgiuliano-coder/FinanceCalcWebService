package com.mgcoder.financecalcws.controllers;

import com.mgcoder.financecalcws.entities.Income;
import com.mgcoder.financecalcws.services.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IncomeController {
    @Autowired
    private IncomeService incomeService;

    @RequestMapping("/incomes/r")
    public List<Income> getAll() {
        return incomeService.getAll();
    }

    @RequestMapping("/incomes/r/{id}")
    public Income getById(@PathVariable Integer id) {
        return incomeService.getById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/incomes/u/{id}")
    public void update(@PathVariable Integer id, @RequestBody Income income) {
        income.setId(id);
        incomeService.update(id, income);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/incomes/d/{id}")
    public void delete(@PathVariable Integer id) {
        incomeService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/incomes/c")
    public void add(@RequestBody Income income) {
        incomeService.add(income);
    }
}
