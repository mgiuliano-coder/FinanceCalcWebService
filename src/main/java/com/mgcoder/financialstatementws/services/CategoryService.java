package com.mgcoder.financecalcws.services;

import com.mgcoder.financecalcws.entities.Category;
import com.mgcoder.financecalcws.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CategoryService implements FinanceService<Category, Integer> {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll(@NonNull Integer userId) {
        List<Category> categories = new ArrayList<>();
        categoryRepository.findAll(userId).forEach(categories::add);
        return categories;
    }

    @Override
    public Category getById(@NonNull Integer id, @NonNull Integer userId) {
        return categoryRepository.findById(id, userId).get();
    }

    @Override
    public void update(@NonNull Integer id, Category category) {
        if(categoryRepository.existsById(id))
            categoryRepository.save(category);
    }

    @Override
    public void delete(@NonNull Integer id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public void add(Category category) {
        if(!categoryRepository.existsById(category.getId()))
            categoryRepository.save(category);
    }
}
