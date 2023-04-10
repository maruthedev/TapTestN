package com.example.taptestn.controller;

import com.example.taptestn.model.condition.PointCondition;
import com.example.taptestn.service.PointConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "pointCondition", produces = "application/json")
public class PointConditionController{
    @Autowired
    PointConditionService service;

    @PostMapping(path = "create")
    public PointCondition create(PointCondition pointCondition) {
        return service.create(pointCondition);
    }

    @PostMapping(path = "update")
    public PointCondition update(PointCondition pointCondition) {
        return service.update(pointCondition);
    }

    @PostMapping(path = "delete")
    public boolean delete(PointCondition pointCondition) {
        return service.delete(pointCondition);
    }

    @GetMapping(path = "getAll")
    public List<PointCondition> getAllPointsCondition() {
        return service.getAllPointsCondition();
    }
}
