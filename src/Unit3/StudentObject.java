package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class StudentObject {
    public static void main(String[] args) {
        ArrayList<Student> stobj = new ArrayList<>();
        stobj.add(new Student(21,"Vijay",100));
        stobj.add(new Student(20,"Abhi",101));
        stobj.add(new Student(22,"Rahul",102));
        stobj.add(new Student(23,"Kavi",103));
        stobj.add(new Student(24,"Ravi",104));
        stobj.add(new Student(19,"Ramesh",105));

        Collections.sort(stobj);
        for(Student st : stobj){
            System.out.println("Name "+st.name+" Age "+st.age+" Roll "+st.roll_no);
        }
    }
}
