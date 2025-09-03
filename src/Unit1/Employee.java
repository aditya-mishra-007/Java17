package Unit1;

public class Employee {
    int emp_id;
    String emp_name;
    double emp_salary;
    static String emp_org = "TCS"; // when a static variable is declared it is share among all same levels in objects

    public Employee(int emp_id, String emp_name, double emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }

    public void display(){
        System.out.println("EMP ID: "+emp_id);
        System.out.println("EMP NAME: "+emp_name);
        System.out.println("EMP SALARY: "+emp_salary);
    }

    public static void emp_info(){ // if we have created the method using 'static' we can access it even without creating an object
        System.out.println(emp_org);
    }
}
