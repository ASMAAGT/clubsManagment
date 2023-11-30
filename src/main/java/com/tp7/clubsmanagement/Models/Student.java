package com.tp7.clubsmanagement.Models;
import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

import java.util.List;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer NSC;
    private String Email;



    public String getEmail() {
        return Email;
    }

    public Classroom getClassroom() {
        return classroom;
    }



    public void setEmail(String email) {
        Email = email;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @ManyToMany
    @JoinTable(
            name = "Integrate_In_Club",
            joinColumns = @JoinColumn(name = "NSC"),
            inverseJoinColumns = @JoinColumn(name = "REF"))

    List<Club> clubs;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="ClassRoom_Id")
    @JsonIgnore
    private Classroom classroom;


    public List<Club> getClubs() {
        return clubs;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }

    public void addClub(Club club) {
        this.clubs.add(club);
        club.getStudents().add(this);
    }

    public void removeClub(long clubId) {
        Club club = this.clubs.stream().filter(t -> t.getREF().equals(clubId)).findFirst().orElse(null);
        if (club != null) {
            this.clubs.remove(club);
            club.getStudents().remove(this);
        }}
}
