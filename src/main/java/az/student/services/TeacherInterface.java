package az.student.services;

import az.student.entity.Teacher;

import java.util.List;

public interface TeacherInterface {
    void addTeacher(Teacher teacher);
    void deleteTeacher(int id);
    List<Teacher> getAllTeacher();
}
