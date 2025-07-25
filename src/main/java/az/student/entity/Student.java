package az.student.entity;

public class Student extends Person{
    private int scholarship;

    public Student( String fullName, int age, int scholarship) {
        super( fullName, age);
        this.scholarship = scholarship;
    }

    public Student() {
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public void showUserData() {

    }

    @Override
    public String toString() {
        return super.toString() +
                " , scholarship=" + scholarship;
    }
}
