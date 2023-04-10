package com.example.taptestn.repository;

import com.example.taptestn.model.condition.DivisionPointCondition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionPointConditionRepository extends JpaRepository<DivisionPointCondition, Double> {
}
