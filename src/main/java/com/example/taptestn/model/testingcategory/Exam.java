package com.example.taptestn.model.testingcategory;

import com.example.taptestn.model.Examinee;
import com.example.taptestn.model.testingcategory.Subject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "exam")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "point")
    private Double point;
    @ManyToOne
    @JsonIgnore
    private Examinee examinee;
    @ManyToOne
    @JsonIgnore
    private Subject subject;

    public double getPoint() {
        return point * subject.getCoefficient();
    }
}
