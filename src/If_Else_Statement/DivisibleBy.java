package If_Else_Statement;

import java.util.*;

public class DivisibleBy {
    public static void divisibleBy5and11 (int n){
        if (n % 5 == 0 && n % 11 == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        divisibleBy5and11(n);
        sc.close();
    }
}
