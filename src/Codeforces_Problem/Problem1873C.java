package Codeforces_Problem;

import java.io.*;
import java.util.*;

public class Problem1873C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int ans = 0;

            for (int i = 0; i < 10; i++) {
                String s = sc.next();
                for (int j = 0; j < 10; j++) {
                    if (s.charAt(j) == 'X') {
                        ans += Math.min(Math.min(i + 1, 10 - i),
                                        Math.min(j + 1, 10 - j));
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
