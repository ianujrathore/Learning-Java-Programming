package If_Else_Statement;

import java.util.*;

public class OddEven {
    public static void checkOddEven (int n){
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkOddEven(n);
        sc.close();
    }
}
