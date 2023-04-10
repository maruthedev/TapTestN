package com.example.taptestn.model.condition;

import com.example.taptestn.model.Division;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="divisionpointcondition")
public class DivisionPointCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JsonIgnore
    private Division division;

    @ManyToOne
    @JsonIgnore
    private PointCondition pointCondition;
}
