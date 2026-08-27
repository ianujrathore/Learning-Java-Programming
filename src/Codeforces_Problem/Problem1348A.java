package Codeforces_Problem;

import java.util.*;

public class Problem1348A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long sum1 = 0;
            long sum2 = 0;

            for (int i = 1; i <= n; i++) {
                long value = 1L << i;

                if (i <= n / 2) {
                    sum1 += value;
                } else {
                    sum2 += value;
                }
            }

            sum1 += 1L << n;
            sum2 -= 1L << n;

            System.out.println(Math.abs(sum1 - sum2));
        }
    }
}
