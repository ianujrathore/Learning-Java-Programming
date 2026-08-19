package Codeforces_Problem;

import java.util.*;

public class Problem2149A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int zeros = 0;
            int negatives = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x == 0) zeros++;
                if (x == -1) negatives++;
            }

            System.out.println(zeros + (negatives % 2) * 2);
        }
    }
}
