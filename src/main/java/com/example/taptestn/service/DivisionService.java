package com.example.taptestn.service;

import com.example.taptestn.model.Division;
import com.example.taptestn.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements CustomCrudService<Division> {
    @Autowired
    DivisionRepository repository;

    @Override
    public Division create(Division division) {
        return repository.save(division);
    }

    @Override
    public Division update(Division division) {
        return repository.save(division);
    }

    @Override
    public boolean delete(Division division) {
        try {
            repository.save(division);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Division> getAllDivisions(){
        return repository.findAll();
    }
}
