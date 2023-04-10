package com.example.taptestn.service;

import com.example.taptestn.model.Division;
import com.example.taptestn.model.testingcategory.Exam;
import com.example.taptestn.model.Examinee;
import com.example.taptestn.model.base.Evaluable;
import com.example.taptestn.repository.ExamineeRepository;
import com.example.taptestn.repository.PointConditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamineeService implements CustomCrudService<Examinee>, Evaluable {
    @Autowired
    ExamineeRepository repository;
    @Autowired
    PointConditionRepository pointConditionRepository;
    @Autowired
    ExamineeRepository examineeRepository;

    @Override
    public Examinee create(Examinee examinee) {
        return repository.save(examinee);
    }

    @Override
    public Examinee update(Examinee examinee) {
        return repository.save(examinee);
    }

    @Override
    public boolean delete(Examinee examinee) {
        try {
            repository.delete(examinee);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean evaluate(Examinee examinee) {
        Division examineeDivision = examinee.getDivision();
        double examineeTotalPoints = 0;
        double examineeDivisionPoints = 0;
        double minimumTotalPoints = pointConditionRepository.getMinimumPoints(examineeDivision.getId(), "total");
        double minimumDivisionPoints = pointConditionRepository.getMinimumPoints(examineeDivision.getId(), examineeDivision.getName());

        for (Exam e : examinee.getExams()) {
            examineeTotalPoints += e.getPoint();
            if (e.getSubject().getDivision().equals(examineeDivision)) examineeDivisionPoints += e.getPoint();
        }
        return (examineeTotalPoints >= minimumTotalPoints) && (examineeDivisionPoints >= minimumDivisionPoints);
    }

    public Integer getPassedExaminee() {
        int count = 0;
        List<Examinee> examinees = examineeRepository.findAll();
        for (Examinee e : examinees) {
            if (evaluate(e)) count++;
        }
        return count;
    }
}
