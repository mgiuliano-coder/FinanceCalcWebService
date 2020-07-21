package com.mgcoder.financecalcws.controllers;

import com.mgcoder.financecalcws.entities.Liability;
import com.mgcoder.financecalcws.services.LiabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LiabilityController {
    @Autowired
    private LiabilityService liabilityService;

    @RequestMapping("/liabilities/r/{userId}")
    public List<Liability> getAll(@NonNull @PathVariable Integer userId) {
        return liabilityService.getAll(userId);
    }

    @RequestMapping("/liabilities/r/{id}/{userId}")
    public Liability getById(@NonNull @PathVariable Integer id, @NonNull @PathVariable Integer userId) {
        return liabilityService.getById(id, userId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/liabilities/u/{id}")
    public void update(@NonNull @PathVariable Integer id, @RequestBody Liability liability) {
        liability.setId(id);
        liabilityService.update(id, liability);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/liabilities/d/{id}")
    public void delete(@NonNull @PathVariable Integer id) {
        liabilityService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/liabilities/c")
    public void add(@RequestBody Liability liability) {
        liabilityService.add(liability);
    }
}
