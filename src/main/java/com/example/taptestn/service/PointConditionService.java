package com.example.taptestn.service;

import com.example.taptestn.model.condition.PointCondition;
import com.example.taptestn.repository.PointConditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointConditionService implements CustomCrudService<PointCondition> {
    @Autowired
    PointConditionRepository repository;

    @Override
    public PointCondition create(PointCondition pointCondition) {
        return repository.save(pointCondition);
    }

    @Override
    public PointCondition update(PointCondition pointCondition) {
        return repository.save(pointCondition);
    }

    @Override
    public boolean delete(PointCondition pointCondition) {
        try {
            repository.save(pointCondition);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public List<PointCondition> getAllPointsCondition(){
        return repository.findAll();
    }
}
