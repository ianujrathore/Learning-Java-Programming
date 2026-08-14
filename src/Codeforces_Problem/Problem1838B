package Codeforces_Problem;

import java.util.*;

public class Package1838B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int max = 0, cnt = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 0) {
                    cnt++;
                    max = Math.max(max, cnt);
                } else {
                    cnt = 0;
                }
            }

            System.out.println(max);
        }
    }
}
