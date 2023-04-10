package com.example.taptestn.model;

import com.example.taptestn.model.testingcategory.Exam;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "examinee")
public class Examinee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @ManyToOne
    @JsonIgnore
    private Division division;
    @OneToMany(mappedBy = "examinee")
    private List<Exam> exams;
}
