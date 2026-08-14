package Codeforces_Problem;

import java.util.*;

public class Problem1703A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean[] seen = new boolean[26];
            int ans = 0;

            for (char c : s.toCharArray()) {
                int x = c - 'A';

                if (!seen[x]) {
                    ans += 2;
                    seen[x] = true;
                } else {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}
