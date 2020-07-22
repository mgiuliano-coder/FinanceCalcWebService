package com.mgcoder.financialstatementws.services;

import com.mgcoder.financialstatementws.entities.Liability;
import com.mgcoder.financialstatementws.repositories.LiabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LiabilityService implements FinanceService<Liability, Integer> {
    @Autowired
    private LiabilityRepository liabilityRepository;

    public List<Liability> getAll(@NonNull Integer userId) {
        List<Liability> liabilities = new ArrayList<>();
        liabilityRepository.findAll(userId).forEach(liabilities::add);
        return liabilities;
    }

    public Liability getById(@NonNull Integer id, @NonNull Integer userId) {
        return liabilityRepository.findById(id, userId).get();
    }

    public void update(@NonNull Integer id, Liability liability) {
        if(liabilityRepository.existsById(id))
            liabilityRepository.save(liability);
    }

    public void delete(@NonNull Integer id) {
        liabilityRepository.deleteById(id);
    }

    public void add(Liability liability) {
        if(!liabilityRepository.existsById(liability.getId()))
            liabilityRepository.save(liability);
    }
}
