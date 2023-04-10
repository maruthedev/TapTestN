package com.example.taptestn.service;

import com.example.taptestn.model.testingcategory.Exam;
import com.example.taptestn.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService implements CustomCrudService<Exam> {
    @Autowired
    ExamRepository repository;

    @Override
    public Exam create(Exam exam) {
        return repository.save(exam);
    }

    @Override
    public Exam update(Exam exam) {
        return repository.save(exam);
    }

    @Override
    public boolean delete(Exam exam) {
        try {
            repository.delete(exam);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
