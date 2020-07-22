package com.mgcoder.financialstatementws.controllers;

import com.mgcoder.financialstatementws.entities.Expense;
import com.mgcoder.financialstatementws.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @RequestMapping("/expenses/r/{userId}")
    public List<Expense> getAll(@NonNull @PathVariable Integer userId) {
        return expenseService.getAll(userId);
    }

    @RequestMapping("/expenses/r/{id}/{userId}")
    public Expense getById(@NonNull @PathVariable Integer id, @NonNull @PathVariable Integer userId) {
        return expenseService.getById(id, userId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/expenses/u/{id}")
    public void update(@NonNull @PathVariable Integer id, @RequestBody Expense expense) {
        expense.setId(id);
        expenseService.update(id, expense);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/expenses/d/{id}")
    public void delete(@NonNull @PathVariable Integer id) {
        expenseService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/expenses/c")
    public void add(@RequestBody Expense expense) {
        expenseService.add(expense);
    }
}
