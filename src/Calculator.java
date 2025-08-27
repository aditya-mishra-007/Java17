import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z = 0;
        System.out.println("Enter any two number ");
        x = sc.nextInt();
        y = sc.nextInt();
        try { // where exception can come
            z = x / y;
        } catch (ArithmeticException e) { // if exception come only then it will run
            System.out.println(e.getMessage());
        } finally { // it will always will be executed whether exception  will come or not
            System.out.println(z);
        }
    }
}
