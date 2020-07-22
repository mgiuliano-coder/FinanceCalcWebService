package com.mgcoder.financecalcws.repositories;

import com.mgcoder.financecalcws.entities.Asset;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface AssetRepository extends CrudRepository<Asset, Integer> {

    @Query("SELECT a FROM Asset a WHERE a.userId = :userId")
    public Iterable<Asset> findAll(@NonNull @Param("userId") Integer userId);

    @Query("SELECT a FROM Asset a WHERE a.id = :id and a.userId = :userId")
    public Optional<Asset> findById(@NonNull @Param("id")Integer id, @NonNull @Param("userId") Integer userId);
}
