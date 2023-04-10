package com.example.taptestn.service;

import com.example.taptestn.model.testingcategory.Subject;
import com.example.taptestn.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService implements CustomCrudService<Subject> {
    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public Subject create(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject update(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public boolean delete(Subject subject) {
        try {
            subjectRepository.delete(subject);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
}
