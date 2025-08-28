package Encapsulation;

public class MyMain {
    public static void main(String[] args) {
        Student st = new Student(1,"Abhishek","F");
//        System.out.println(st.grade);
        st.setGrade("Pass");
        System.out.println(st.getGrade());
    }
}



