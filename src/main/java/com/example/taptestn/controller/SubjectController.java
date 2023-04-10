package com.example.taptestn.controller;

import com.example.taptestn.model.testingcategory.Subject;
import com.example.taptestn.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "subject", produces = "application/json")
public class SubjectController{
    @Autowired
    SubjectService service;

    @PostMapping(path = "create")
    public Subject create(Subject subject) {
        return service.create(subject);
    }

    @PostMapping(path = "update")
    public Subject update(Subject subject) {
        return service.update(subject);
    }

    @PostMapping(path = "delete")
    public boolean delete(Subject subject) {
        return service.delete(subject);
    }

    @GetMapping(path = "getAll")
    public List<Subject> getAllSubjects(){
        return service.getAllSubjects();
    }
}
