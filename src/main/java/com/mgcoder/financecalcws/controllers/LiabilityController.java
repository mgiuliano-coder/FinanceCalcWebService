package com.mgcoder.financecalcws.controllers;

import com.mgcoder.financecalcws.entities.Liability;
import com.mgcoder.financecalcws.services.LiabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LiabilityController {
    @Autowired
    private LiabilityService liabilityService;

    @RequestMapping("/liabilities/r")
    public List<Liability> getAll() {
        return liabilityService.getAll();
    }

    @RequestMapping("/liabilities/r/{id}")
    public Liability getById(@PathVariable Integer id) {
        return liabilityService.getById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/liabilities/u/{id}")
    public void update(@PathVariable Integer id, @RequestBody Liability liability) {
        liability.setId(id);
        liabilityService.update(id, liability);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/liabilities/d/{id}")
    public void delete(@PathVariable Integer id) {
        liabilityService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/liabilities/c")
    public void add(@RequestBody Liability liability) {
        liabilityService.add(liability);
    }
}
