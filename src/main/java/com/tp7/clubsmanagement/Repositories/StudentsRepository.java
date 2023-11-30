package com.tp7.clubsmanagement.Repositories;

import Models.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentsRepository extends CrudRepository<Student,Integer> {

}
