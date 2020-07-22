package com.mgcoder.financialstatementws.services;

import com.mgcoder.financialstatementws.entities.Asset;
import com.mgcoder.financialstatementws.repositories.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssetService implements FinanceService<Asset, Integer> {
    @Autowired
    private AssetRepository assetRepository;

    public List<Asset> getAll(@NonNull Integer userId) {
        List<Asset> assets = new ArrayList<>();
        assetRepository.findAll(userId).forEach(assets::add);
        return assets;
    }

    public Asset getById(@NonNull Integer id, @NonNull Integer userId) {
        return assetRepository.findById(id, userId).get();
    }

    public void update(@NonNull Integer id, Asset asset) {
        if(assetRepository.existsById(id))
            assetRepository.save(asset);
    }

    public void delete(@NonNull Integer id) {
        assetRepository.deleteById(id);
    }

    public void add(Asset asset) {
        if(!assetRepository.existsById(asset.getId()))
            assetRepository.save(asset);
    }
}
