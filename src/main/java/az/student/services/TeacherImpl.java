package az.student.services;

import az.student.database.DataBase;
import az.student.entity.Teacher;

import java.util.List;

public class TeacherImpl implements TeacherInterface {
    @Override
    public void addTeacher(Teacher teacher) {
        DataBase.teachers.add(teacher);
    }

    @Override
    public void deleteTeacher(int id) {
        boolean removed = DataBase.teachers.removeIf(teacher -> teacher.getId() == id);
        if (removed) {
            System.out.println("Teacher Silindi: " + id);
        }else {
            System.out.println("Teacher tapilmadi");
        }
    }

    @Override
    public List<Teacher> getAllTeacher() {
        if (DataBase.teachers.isEmpty()) {
            System.out.println("Teacher Tapilmadi!!");
        }else {
            DataBase.teachers.forEach(System.out::println);
        }
        return DataBase.teachers;
    }
}
