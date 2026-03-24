package If_Else_Statement;

import java.util.*;

public class CheckNumber {
    public static void checkNumbers(int n){
        if(n > 0){
            System.out.println("Positive number");
        } else if (n < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkNumbers(n);
        sc.close();
    }
}
