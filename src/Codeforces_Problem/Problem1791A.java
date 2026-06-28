package Codeforces_Problem;

import java.util.*;

public class Problem1791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = "codeforces";
        while (t-- > 0) {
            char c = sc.next().charAt(0);
            System.out.println(s.indexOf(c) != -1 ? "YES" : "NO");
        }
    }
}
