package com.example.taptestn.controller;

import com.example.taptestn.model.Examinee;
import com.example.taptestn.service.ExamineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "examinee", produces = "application/json")
public class ExamineeController{
    @Autowired
    ExamineeService service;

    @PostMapping(path = "create")
    public Examinee create(@RequestBody Examinee examinee) {
        return service.create(examinee);
    }

    @PostMapping(path = "update")
    public Examinee update(@RequestBody Examinee examinee) {
        return service.update(examinee);
    }

    @PostMapping(path = "delete")
    public boolean delete(@RequestBody Examinee examinee) {
        return service.delete(examinee);
    }

    @GetMapping(path = "passedExaminee")
    public Integer getPassedExaminee() {
        return service.getPassedExaminee();
    }
}
