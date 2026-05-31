package Codeforces_Problem;

import java.util.*;

public class Problem281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(
            Character.toUpperCase(s.charAt(0)) + s.substring(1)
        );
    }
}
