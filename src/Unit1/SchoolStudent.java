package Unit1;

public class SchoolStudent extends Student {
    SchoolStudent(int roll_No, String name){
        super(roll_No,name);
    }
    public void attend_class(){
        System.out.println(name+"is attending class offline");
    }
    public void give_exam(){
        System.out.println(name+" giving exam on pen and paper");
    }
}
