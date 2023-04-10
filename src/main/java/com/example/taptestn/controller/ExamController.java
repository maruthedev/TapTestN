package com.example.taptestn.controller;

import com.example.taptestn.model.testingcategory.Exam;
import com.example.taptestn.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "exam", produces = "application/json")
public class ExamController{
    @Autowired
    ExamService service;

    @PostMapping(path = "create")
    public Exam create(@RequestBody Exam exam) {
        return service.create(exam);
    }

    @PostMapping(path = "update")
    public Exam update(@RequestBody Exam exam) {
        return service.update(exam);
    }

    @PostMapping(path = "delete")
    public boolean delete(@RequestBody Exam exam) {
        return service.delete(exam);
    }
}
