package az.student.services;

import az.student.database.DataBase;
import az.student.entity.Student;

import java.util.List;

public class StudentImpl implements StudentInterface{

    @Override
    public void addStudent(Student student) {
        DataBase.students.add(student);
    }

    @Override
    public void deleteStudent(int id) {
        boolean removed = DataBase.students.removeIf(s -> s.getId() == id);

        if (removed) {
            System.out.println("Silinen telebe: " + id);
        }else {
            System.out.println("Telebe tapilmadi!!");
        }
    }

    @Override
    public List<Student> getAllStudent() {
        return null;
    }
}
