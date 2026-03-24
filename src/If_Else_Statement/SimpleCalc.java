package If_Else_Statement;

import java.util.*;

public class SimpleCalc {
    public static void simpleCal(double num1, double num2, char op){
        if(op == '+'){
            System.out.println(num1 + num2);
        } else if (op == '-') {
            if (num1 > num2) {
                System.out.println(num1 - num2);
            } else {
                System.out.println(num2 - num1);
            }
        } else if (op == '*') {
            System.out.println(num1 * num2);
        } else if (op == '/') {
            if (num2 == 0){
                System.out.println("Cannot divide by zero");
            } else {
                System.out.println(num1/num2);
            }
        } else {
            System.out.println("Invalid operator use : + , - , * ,/");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operator (+, - , * , /) : ");
        char op = sc.next().charAt(0);

        simpleCal(num1, num2, op);
        sc.close();
    }
}