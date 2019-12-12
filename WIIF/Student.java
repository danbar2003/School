package WIIF;

public class Student extends Person {
    private int grade;
    private double marks;


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Student(int age, String name, String gender, int grade, double marks) {
        super(age, name, gender);
        this.grade = grade;
        this.marks = marks;
    }

    public Student(int grade, double marks) {
        this.grade = grade;
        this.marks = marks;
    }
}
