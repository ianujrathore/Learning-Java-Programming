package If_Else_Statement;

import java.util.*;

public class LargestOfNumber {

    public static void isLargest(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        isLargest(num1, num2, num3);

        sc.close();
    }
}