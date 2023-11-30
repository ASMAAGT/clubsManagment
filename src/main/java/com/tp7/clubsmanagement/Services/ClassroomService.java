package com.tp7.clubsmanagement.Services;

import Models.Classroom;

import java.util.List;

public interface ClassroomService {

    /* ********* SAVE **********
    ********* OPERATION **************
     */
    Classroom saveClassroom (Classroom classroom);

    /* ********* READ **********
     ********* OPERATION **************
     */

    List<Classroom> fetchClassroomList();

    /* ********* UPDATE **********
     ********* OPERATION **************
     */
    Classroom updateClassroom(Classroom classroom, Integer classroomId);

    /* ********* DELETE **********
     ********* OPERATION **************
     */

    void deleteClassroomById(Integer classroomId);
    /* ********* GETBYID **********
     ********* OPERATION **************
     */
    Classroom getClassroomById(Integer classroomId);
}

