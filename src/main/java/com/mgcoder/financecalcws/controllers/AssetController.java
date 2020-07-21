package com.mgcoder.financecalcws.controllers;

import com.mgcoder.financecalcws.entities.Asset;
import com.mgcoder.financecalcws.services.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssetController {
    @Autowired
    private AssetService assetService;

    @RequestMapping("/assets/r/{userId}")
    public List<Asset> getAll(@NonNull @PathVariable Integer userId) {
        return assetService.getAll(userId);
    }

    @RequestMapping("/assets/r/{id}/{userId}")
    public Asset getById(@NonNull @PathVariable Integer id, @NonNull @PathVariable Integer userId) {
        return assetService.getById(id, userId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/assets/u/{id}")
    public void update(@NonNull @PathVariable Integer id, @RequestBody Asset asset) {
        asset.setId(id);
        assetService.update(id, asset);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/assets/d/{id}")
    public void delete(@NonNull @PathVariable Integer id) {
        assetService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/assets/c")
    public void add(@RequestBody Asset asset) {
        assetService.add(asset);
    }
}
