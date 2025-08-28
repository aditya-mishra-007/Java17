package Encapsulation;

public class Student {
    public int roll_No;
    public String name;
    private String grade;
    public Student(int roll_No, String name, String grade) {
        this.roll_No = roll_No;
        this.name = name;
        this.grade = grade;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getGrade(){
        return grade;
    }
}
