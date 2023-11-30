package com.tp7.clubsmanagement.Controllers;

import Models.Classroom;
import com.tp7.clubsmanagement.Services.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClassroomController {

    @Autowired
    private ClassroomService classroomService;

    @PostMapping("/classrooms")
    public Classroom saveClassroom(@RequestBody Classroom classroom) {

        return classroomService.saveClassroom(classroom);
    }

    @GetMapping("/Allclassrooms")

    public List<Classroom> fetchClassroomList() {
        return classroomService.fetchClassroomList();
    }
    @DeleteMapping("/classroom/{id}")
    public String deleteClassroomById(@PathVariable("id")
                                      Integer classroomId) {
        try {
            classroomService.deleteClassroomById(classroomId);
            return String.valueOf(new ResponseEntity<>(HttpStatus.NO_CONTENT));
            //return "Deleted Successfully";
        } catch (Exception e) {
            return String.valueOf(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
        }
    }
    @PutMapping("/updateClassroom/{id}")
    public ResponseEntity<Classroom> updateClassroom( @RequestBody Classroom classroom,@PathVariable Integer classroomId) {
        Classroom updatedClassroom = classroomService.updateClassroom(classroom,classroomId);
        return ResponseEntity.ok(updatedClassroom);
    }

}
