public class MyEmp {
    static { // static block is runs first even before main
        System.out.println("I am in static block");
    }
    public static void main(String[] args) {
//        Employee e1 = new Employee(12, "Amit", 2000);
//        e1.display();
        Employee.emp_info();
    }
}
