package com.mgcoder.financecalcws.services;

import java.util.List;

public interface FinanceService<E, I> {
    List<E> getAll();

    E getById(I id);

    void update(I id, E object);

    void delete(I id);

    void add(E object);
}
