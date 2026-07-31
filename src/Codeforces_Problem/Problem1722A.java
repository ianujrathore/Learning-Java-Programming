package Codeforces_Problem;

import java.util.*;

public class Problem1722A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            char[] a = s.toCharArray();
            Arrays.sort(a);

            String target = "Timur";
            char[] b = target.toCharArray();
            Arrays.sort(b);

            System.out.println(Arrays.equals(a, b) ? "YES" : "NO");
        }
    }
}
