package com.tp7.clubsmanagement.Models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
public class Club {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer REF;

        private Date Creation_date;

    public Date getCreation_date() {
        return Creation_date;
    }

    public void setCreation_date(Date creation_date) {
        Creation_date = creation_date;
    }

    @ManyToMany(mappedBy = "clubs",fetch = FetchType.LAZY)
        List<Student> students;


        public List<Student> getStudents() {
            return students;
        }

        public void setStudents(List<Student> students) {
            this.students =students;
        }

    public Integer getREF() {
        return REF;
    }
}
