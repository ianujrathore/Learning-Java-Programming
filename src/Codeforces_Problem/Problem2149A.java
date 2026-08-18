package Codeforces_Problem;

import java.util.*;

public class Problem2149A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int neg = 0;

            for (int i = 0; i < n; i++) {
                if (sc.nextInt() < 0) neg++;
            }

            System.out.println((neg + 1) / 2);
        }
    }
}
