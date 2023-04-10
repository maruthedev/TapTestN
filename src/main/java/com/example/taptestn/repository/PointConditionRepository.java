package com.example.taptestn.repository;

import com.example.taptestn.model.condition.PointCondition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PointConditionRepository extends JpaRepository<PointCondition, Double> {
    @Query("SELECT pc.id, pc.totalPoint FROM pointcondition pc " +
            "JOIN divisionpointcondition dpc ON pc.id = dpc.pointCondition.id " +
            "JOIN division d ON d.id = dpc.division.id " +
            "WHERE d.id = ?1 AND dpc.description LIKE %?2%")
    Double getMinimumPoints(Integer divisionId, String whatDoesThisConditionUseFor);
}
