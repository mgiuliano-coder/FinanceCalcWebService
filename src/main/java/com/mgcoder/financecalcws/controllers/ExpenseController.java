package com.mgcoder.financecalcws.controllers;

import com.mgcoder.financecalcws.entities.Expense;
import com.mgcoder.financecalcws.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @RequestMapping("/expenses/r")
    public List<Expense> getAll() {
        return expenseService.getAll();
    }

    @RequestMapping("/expenses/r/{id}")
    public Expense getById(@PathVariable Integer id) {
        return expenseService.getById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/expenses/u/{id}")
    public void update(@PathVariable Integer id, @RequestBody Expense expense) {
        expense.setId(id);
        expenseService.update(id, expense);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/expenses/d/{id}")
    public void delete(@PathVariable Integer id) {
        expenseService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/expenses/c")
    public void add(@RequestBody Expense expense) {
        expenseService.add(expense);
    }
}
