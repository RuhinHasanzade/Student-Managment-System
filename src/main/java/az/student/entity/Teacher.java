package az.student.entity;

public class Teacher extends Person{
    private int salary;

    public Teacher(int id, String fullName, int age, int salary) {
        super(id, fullName, age);
        this.salary = salary;
    }

    public Teacher() {

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void showUserData() {

    }

    @Override
    public String toString() {
        return  super.toString() +
                " , salary=" + salary;
    }
}
