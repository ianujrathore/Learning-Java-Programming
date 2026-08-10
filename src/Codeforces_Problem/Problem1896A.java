package Codeforces_Problem;

import java.io.*;
import java.util.*;

public class Problem1896A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > k) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
