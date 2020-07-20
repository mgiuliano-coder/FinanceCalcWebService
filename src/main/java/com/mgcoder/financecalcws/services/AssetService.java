package com.mgcoder.financecalcws.services;

import com.mgcoder.financecalcws.entities.Asset;
import com.mgcoder.financecalcws.repositories.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssetService implements FinanceService<Asset, Integer> {
    @Autowired
    private AssetRepository assetRepository;

    public List<Asset> getAll() {
        List<Asset> assets = new ArrayList<>();
        assetRepository.findAll().forEach(assets::add);
        return assets;
    }

    public Asset getById(Integer id) {
        return assetRepository.findById(id).get();
    }

    public void update(Integer id, Asset asset) {
        if(assetRepository.existsById(id))
            assetRepository.save(asset);
    }

    public void delete(Integer id) {
        assetRepository.deleteById(id);
    }

    public void add(Asset asset) {
        if(!assetRepository.existsById(asset.getId()))
            assetRepository.save(asset);
    }
}
