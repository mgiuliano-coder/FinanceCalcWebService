package com.mgcoder.financecalcws.services;

import com.mgcoder.financecalcws.entities.Liability;
import com.mgcoder.financecalcws.repositories.LiabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LiabilityService implements FinanceService<Liability, Integer> {
    @Autowired
    private LiabilityRepository liabilityRepository;

    public List<Liability> getAll() {
        List<Liability> liabilities = new ArrayList<>();
        liabilityRepository.findAll().forEach(liabilities::add);
        return liabilities;
    }

    public Liability getById(Integer id) {
        return liabilityRepository.findById(id).get();
    }

    public void update(Integer id, Liability liability) {
        if(liabilityRepository.existsById(id))
            liabilityRepository.save(liability);
    }

    public void delete(Integer id) {
        liabilityRepository.deleteById(id);
    }

    public void add(Liability liability) {
        if(!liabilityRepository.existsById(liability.getId()))
            liabilityRepository.save(liability);
    }
}
