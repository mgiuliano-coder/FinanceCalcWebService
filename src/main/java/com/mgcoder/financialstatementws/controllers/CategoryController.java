package com.mgcoder.financecalcws.controllers;

import com.mgcoder.financecalcws.entities.Category;
import com.mgcoder.financecalcws.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/categories/r/{userId}")
    public List<Category> getAll(@NonNull @PathVariable Integer userId) {
        return categoryService.getAll(userId);
    }

    @RequestMapping("/categories/r/{id}/{userId}")
    public Category getById(@NonNull @PathVariable Integer id, @NonNull @PathVariable Integer userId) {
        return categoryService.getById(id, userId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/categories/u/{id}")
    public void update(@NonNull @PathVariable Integer id, @RequestBody Category category) {
        category.setId(id);
        categoryService.update(id, category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/categories/d/{id}")
    public void delete(@NonNull @PathVariable Integer id) {
        categoryService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/categories/c")
    public void add(@RequestBody Category category) {
        categoryService.add(category);
    }
}
