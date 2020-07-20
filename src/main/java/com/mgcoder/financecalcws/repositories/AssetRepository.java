package com.mgcoder.financecalcws.repositories;

import com.mgcoder.financecalcws.entities.Asset;
import org.springframework.data.repository.CrudRepository;

public interface AssetRepository extends CrudRepository<Asset, Integer> {
}
