package com.tp7.clubsmanagement.Repositories;

import com.tp7.clubsmanagement.Models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepository extends CrudRepository<Student,Integer> {

}
