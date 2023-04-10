package com.example.taptestn.controller;

import com.example.taptestn.model.condition.DivisionPointCondition;
import com.example.taptestn.service.DivisionPointConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path = "divisionpointcondition", produces = "application/json")
public class DivisionPointConditionController{
    @Autowired
    DivisionPointConditionService service;

    @PostMapping(path = "create")
    public DivisionPointCondition create(DivisionPointCondition divisionPointCondition) {
        return service.create(divisionPointCondition);
    }

    @PostMapping(path = "update")
    public DivisionPointCondition update(DivisionPointCondition divisionPointCondition) {
        return service.update(divisionPointCondition);
    }

    @PostMapping(path = "delete")
    public boolean delete(DivisionPointCondition divisionPointCondition) {
        return service.delete(divisionPointCondition);
    }
}
