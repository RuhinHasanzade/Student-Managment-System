package az.student;

import az.student.database.DataBase;
import az.student.entity.Student;
import az.student.services.StudentImpl;
import az.student.services.StudentInterface;
import az.student.services.TeacherImpl;
import az.student.services.TeacherInterface;

public class Main {
    public static void main(String[] args) {
        StudentInterface studentInterface =  new StudentImpl();
        TeacherInterface teacherInterface = new TeacherImpl();


        Student student = new Student("Eli Hesenov",10,50);

        studentInterface.addStudent(student);

        teacherInterface.deleteTeacher(4);

        studentInterface.getAllStudent();
        teacherInterface.getAllTeacher();
    }
}
