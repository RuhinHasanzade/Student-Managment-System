package az.student.database;

import az.student.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Student> students = new ArrayList<>();


    static {
        students.add(new Student(1,"Ruhin Hasanzada",19,140));
        students.add(new Student(2,"Emil Valiyev",23,150));
        students.add(new Student(3,"Nil Hasanzada",19,200));
    }
}
