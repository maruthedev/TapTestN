package com.example.taptestn.service;

import com.example.taptestn.model.condition.DivisionPointCondition;
import com.example.taptestn.repository.DivisionPointConditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DivisionPointConditionService implements CustomCrudService<DivisionPointCondition> {
    @Autowired
    DivisionPointConditionRepository repository;

    @Override
    public DivisionPointCondition create(DivisionPointCondition divisionPointCondition) {
        return repository.save(divisionPointCondition);
    }

    @Override
    public DivisionPointCondition update(DivisionPointCondition divisionPointCondition) {
        return repository.save(divisionPointCondition);
    }

    @Override
    public boolean delete(DivisionPointCondition divisionPointCondition) {
        try {
            repository.save(divisionPointCondition);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
