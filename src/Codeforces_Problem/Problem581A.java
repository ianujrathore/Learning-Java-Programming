package Codeforces_Problem;

import java.util.*;

public class Problem581A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int different = Math.min(a, b);
        int same = (Math.max(a, b) - different) / 2;

        System.out.println(different + " " + same);
    }
}
