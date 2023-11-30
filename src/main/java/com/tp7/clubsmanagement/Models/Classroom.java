package com.tp7.clubsmanagement.Models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id ;
    private  String Name;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    @OneToMany(mappedBy="classroom",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnoreProperties("classroom")
    private List<Student> students;
}
