package Codeforces_Problem;

import java.util.*;

public class Problem1343B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n % 4 != 0) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            int half = n / 2;
            int oddSum = 0;
            int evenSum = 0;

            for (int i = 1; i <= half; i++) {
                int x = 2 * i;
                System.out.print(x + " ");
                evenSum += x;
            }

            for (int i = 1; i < half; i++) {
                int x = 2 * i - 1;
                System.out.print(x + " ");
                oddSum += x;
            }

            int last = evenSum - oddSum;
            System.out.println(last);
        }
    }
}
