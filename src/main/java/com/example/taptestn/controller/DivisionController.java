package com.example.taptestn.controller;

import com.example.taptestn.model.Division;
import com.example.taptestn.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "division", produces = "application/json")
public class DivisionController{
    @Autowired
    DivisionService service;

    @PostMapping(path = "create")
    public Division create(Division division) {
        return service.create(division);
    }

    @PostMapping(path = "update")
    public Division update(Division division) {
        return service.update(division);
    }

    @PostMapping(path = "delete")
    public boolean delete(Division division) {
        return service.delete(division);
    }

    @GetMapping(path = "getAll")
    public List<Division> getAllDivisions(){
        return service.getAllDivisions();
    }
}
