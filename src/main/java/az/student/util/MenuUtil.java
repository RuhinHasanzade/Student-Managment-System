package az.student.util;

import az.student.database.DataBase;
import az.student.entity.Student;
import az.student.entity.Teacher;
import az.student.services.StudentImpl;
import az.student.services.StudentInterface;
import az.student.services.TeacherImpl;
import az.student.services.TeacherInterface;

import java.util.PropertyResourceBundle;

public class MenuUtil {
    public static void startMenu() {
        while (true) {
            System.out.println("""
                ---------------XOS GELMISIZ---------------
                1. TELEBE ELAVE ET
                2. TELEBELERI GOSTER
                3. MUELLIM ELAVE ET
                4. MUELLIMLERI GOSTER
                5. EXIT
                """);

            int selectedMenu = InputUtil.getInt("Menudan Secim Et: ");
            if (selectedMenu == 1) {
                addStudentMenu();
            }else if(selectedMenu == 2) {
                StudentInterface studentInterface = new StudentImpl();
                studentInterface.getAllStudent();
            } else if (selectedMenu == 3) {
                addTeacherMenu();
            } else if (selectedMenu == 4) {
                TeacherInterface teacherInterface = new TeacherImpl();
                teacherInterface.getAllTeacher();
            }else {
                System.exit(0);
            }
        }


    }

    private static void addStudentMenu() {
        System.out.println("---------------TELEBE ELAVE ET---------------");
        String studentName =   InputUtil.getString("Telebe adi dagil edin: ");
        int studentAge = InputUtil.getInt("Telebenin yasin dagil edin: ");
        int studentScholar = InputUtil.getInt("Telebenin teqaudun dagil edin: ");

        Student student = new Student(studentName,studentAge,studentScholar);
        DataBase.students.add(student);
        System.out.println("TELEBE UGURLA ELAVE EDILDI");
    }

    private static void addTeacherMenu() {
        System.out.println("---------------MUELLIM ELAVE ET---------------");
        String teacherName =   InputUtil.getString("Muellim adi dagil edin: ");
        int teacherAge = InputUtil.getInt("Muellimn yasin dagil edin: ");
        int teachersalary = InputUtil.getInt("Muellimin maasin dagil edin: ");

        Teacher teacher = new Teacher(teacherName,teacherAge,teachersalary);
        DataBase.teachers.add(teacher);
        System.out.println("Muellim UGURLA ELAVE EDILDI");

    }



}
