package com.example.taptestn.repository;

import com.example.taptestn.model.Examinee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamineeRepository extends JpaRepository<Examinee, Integer> {
}
