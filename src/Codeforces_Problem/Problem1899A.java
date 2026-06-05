package Codeforces_Problem;

import java.util.*;

public class Problem1899A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(n % 3 == 0 ? "Second" : "First");
        }
    }
}
