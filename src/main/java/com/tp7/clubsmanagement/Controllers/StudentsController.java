package com.tp7.clubsmanagement.Controllers;
import com.tp7.clubsmanagement.Models.Student;
import com.tp7.clubsmanagement.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentsController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

    @GetMapping("/Allstudents")

    public List<Student> fetchStudentList()
    {
        return studentService.fetchStudentList();
    }
    @DeleteMapping("/student/{id}")
    public String deleteStudentById(@PathVariable("id")
                                    Integer studentId) {
        try {
            studentService.deleteStudentById(studentId);
            return String.valueOf(new ResponseEntity<>(HttpStatus.NO_CONTENT));
            //return "Deleted Successfully";
        } catch (Exception e) {
            return String.valueOf(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
        }
    }

    @PutMapping("/updateStudent/{id}")
    public ResponseEntity<Student> updateStudent( @RequestBody Student student,@PathVariable Integer studentId) {
        Student updatedStudent = studentService.updateStudent(student,studentId);
        return ResponseEntity.ok(updatedStudent);
    }

}
