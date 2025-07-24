package az.student.entity;

import az.student.database.DataBase;

abstract class Person {
    private int id;
    private String fullName;
    private int age;

    public Person( String fullName, int age) {
        this.id = DataBase.students.size() + DataBase.teachers.size() + 1;
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age;
    }

    public abstract void showUserData();


}
