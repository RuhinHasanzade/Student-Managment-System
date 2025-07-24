package az.student.database;

import az.student.entity.Student;
import az.student.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Student> students = new ArrayList<>();
    public static List<Teacher> teachers = new ArrayList<>();


    static {
        students.add(new Student("Ruhin Hasanzada",19,140));
        students.add(new Student("Emil Valiyev",23,150));
        students.add(new Student("Nil Hasanzada",19,200));
        teachers.add((new Teacher("Sebnem Eliyev",26,1000)));
        teachers.add((new Teacher("Zahra Fatullayev",23,2000)));
        teachers.add((new Teacher("Pervin Hasanov",26,5000)));
    }
}
