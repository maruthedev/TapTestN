package com.example.taptestn.model;

import com.example.taptestn.model.condition.DivisionPointCondition;
import com.example.taptestn.model.testingcategory.Subject;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "division")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "division")
    private List<Subject> subjects;

    @OneToMany(mappedBy = "division")
    private List<Examinee> examinees;

    @OneToMany(mappedBy = "division")
    private List<DivisionPointCondition> divisionPointConditions;
}
