package com.example.taptestn.model.testingcategory;

import com.example.taptestn.model.Division;
import com.example.taptestn.model.base.Evaluation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "subject")
public class Subject extends Evaluation {
    @Column(name = "name")
    private String name;
    @Column(name = "coefficient")
    private Double coefficient;
    @ManyToOne
    @JsonIgnore
    private Division division;
    @OneToMany(mappedBy = "subject")
    private List<Exam> exams;
}
