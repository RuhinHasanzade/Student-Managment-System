package az.student.services;

import az.student.entity.Student;

import java.util.List;

public interface StudentInterface {
    void addStudent(Student student);
    void deleteStudent(Student student);
    List<Student> getAllStudent();
}
