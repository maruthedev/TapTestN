package com.example.taptestn.model.condition;

import com.example.taptestn.model.base.Evaluation;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "pointcondition")
public class PointCondition extends Evaluation{
    @Column(name = "totalpoint")
    private Integer totalPoint;
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "pointCondition")
    private List<DivisionPointCondition> divisionPointConditions;
}
