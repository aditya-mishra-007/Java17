public abstract class Student {
    int roll_No;
    String name;
    Student(int roll_No, String name){
        this.roll_No = roll_No;
        this.name = name;
    }
    abstract void attend_class();
    abstract void give_exam();
    void register(){
        System.out.println("Name is "+name+" is registered Successfully with Roll No "+roll_No);
    }
    void display(){
        System.out.println("Name is : "+name);
        System.out.println("Roll Number is : "+roll_No);
    }
}
