package Unit1;

public class MyEmp {
    static { // static block is runs first even before main
        System.out.println("I am in static block");
    }
    public static void main(String[] args) {
//        Unit1.Employee e1 = new Unit1.Employee(12, "Amit", 2000);
//        e1.display();
        Employee.emp_info();
    }
}
