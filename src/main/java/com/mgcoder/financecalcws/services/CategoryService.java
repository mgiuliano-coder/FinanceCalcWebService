package com.mgcoder.financecalcws.services;

import com.mgcoder.financecalcws.entities.Category;
import com.mgcoder.financecalcws.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CategoryService implements FinanceService<Category, Integer> {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        categoryRepository.findAll().forEach(categories::add);
        return categories;
    }

    @Override
    public Category getById(Integer id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public void update(Integer id, Category category) {
        if(categoryRepository.existsById(id))
            categoryRepository.save(category);
    }

    @Override
    public void delete(Integer id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public void add(Category category) {
        if(!categoryRepository.existsById(category.getId()))
            categoryRepository.save(category);
    }
}
