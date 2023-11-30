package com.tp7.clubsmanagement.Services;

import Models.Student;

public interface StudentService {
    Student saveStudent (Student student);

    // read operation
    Iterable<Student> fetchStudentList();

    // update operation
    Student updateStudent(Student student, Integer studentId);

    // delete operation
    void deleteStudentById(Integer studentId);
    Student getStudentById(Integer studentId);

}