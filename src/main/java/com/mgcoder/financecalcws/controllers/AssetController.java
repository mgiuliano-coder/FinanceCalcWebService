package com.mgcoder.financecalcws.controllers;

import com.mgcoder.financecalcws.entities.Asset;
import com.mgcoder.financecalcws.services.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssetController {
    @Autowired
    private AssetService assetService;

    @RequestMapping("/assets/r")
    public List<Asset> getAll() {
        return assetService.getAll();
    }

    @RequestMapping("/assets/r/{id}")
    public Asset getById(@PathVariable Integer id) {
        return assetService.getById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/assets/u/{id}")
    public void update(@PathVariable Integer id, @RequestBody Asset asset) {
        asset.setId(id);
        assetService.update(id, asset);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/assets/d/{id}")
    public void delete(@PathVariable Integer id) {
        assetService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/assets/c")
    public void add(@RequestBody Asset asset) {
        assetService.add(asset);
    }
}
