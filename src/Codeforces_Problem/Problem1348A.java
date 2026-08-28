package Codeforces_Problem;

import java.util.*;

public class Problem1348A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long first = 1L << n;

            for (int i = 1; i < n / 2; i++) {
                first += 1L << i;
            }

            long second = 0;

            for (int i = n / 2; i < n; i++) {
                second += 1L << i;
            }

            System.out.println(first - second);
        }

        sc.close();
    }
}
