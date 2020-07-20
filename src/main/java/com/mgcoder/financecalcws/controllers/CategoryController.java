package com.mgcoder.financecalcws.controllers;

import com.mgcoder.financecalcws.entities.Category;
import com.mgcoder.financecalcws.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/categories/r")
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @RequestMapping("/categories/r/{id}")
    public Category getById(@PathVariable Integer id) {
        return categoryService.getById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/categories/u/{id}")
    public void update(@PathVariable Integer id, @RequestBody Category category) {
        category.setId(id);
        categoryService.update(id, category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/categories/d/{id}")
    public void delete(@PathVariable Integer id) {
        categoryService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/categories/c")
    public void add(@RequestBody Category category) {
        categoryService.add(category);
    }
}
