package Codeforces_Problem;

import java.util.*;

public class Problem2242A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            int max = 0;
            int cnt2 = 0;

            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();
                max = Math.max(max, x);
                if (x == 2) cnt2++;
            }

            if (max > 2 || cnt2 > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
