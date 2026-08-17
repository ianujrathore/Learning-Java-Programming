package Codeforces_Problem;

import java.util.*;

public class Problem2114A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int year = Integer.parseInt(s);
            int x = (int) Math.sqrt(year);

            if (x * x == year) {
                System.out.println(0 + " " + x);
            } else {
                System.out.println(-1);
            }
        }
    }
}
