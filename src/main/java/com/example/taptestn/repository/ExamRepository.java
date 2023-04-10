package com.example.taptestn.repository;

import com.example.taptestn.model.testingcategory.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Double> {

}
