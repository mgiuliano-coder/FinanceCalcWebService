package com.mgcoder.financialstatementws.repositories;

import com.mgcoder.financialstatementws.entities.Liability;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface LiabilityRepository extends CrudRepository<Liability, Integer> {

    @Query("SELECT l FROM Liability l WHERE l.userId = :userId")
    public Iterable<Liability> findAll(@NonNull @Param("userId") Integer userId);

    @Query("SELECT l FROM Liability l WHERE l.id = :id and l.userId = :userId")
    public Optional<Liability> findById(@NonNull @Param("id")Integer id, @NonNull @Param("userId") Integer userId);
}
