package com.tp7.clubsmanagement.Services;


import Models.Classroom;
import Models.Student;
import com.tp7.clubsmanagement.Repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentsRepository studentsRepositoy;





    @Override
    public List<Student> fetchStudentList() {
        return (List<Student>) studentsRepositoy.findAll();
    }

    @Override
    public Student updateStudent(Student student, Integer studentId) {
        return null;
    }

    @Override
    public void deleteStudentById(Integer studentId) {

    }

    @Override
    public Student getStudentById(Integer studentId) {
        return null;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentsRepositoy.save(student);
    }
}