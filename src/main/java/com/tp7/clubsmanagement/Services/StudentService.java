package com.tp7.clubsmanagement.Services;

import com.tp7.clubsmanagement.Models.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent (Student student);

    // read operation
    List<Student> fetchStudentList();

    // update operation
    Student updateStudent(Student student, Integer studentId);

    // delete operation
    void deleteStudentById(Integer studentId);
    Student getStudentById(Integer studentId);

}