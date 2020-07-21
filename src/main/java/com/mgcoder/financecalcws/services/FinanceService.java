package com.mgcoder.financecalcws.services;

import org.springframework.lang.NonNull;

import java.util.List;

public interface FinanceService<E, I> {
    List<E> getAll(I userId);

    E getById(@NonNull I id, @NonNull I userId);

    void update(@NonNull I id, E object);

    void delete(@NonNull I id);

    void add(E object);
}
