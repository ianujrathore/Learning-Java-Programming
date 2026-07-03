package Codeforces_Problem;

import java.io.*;
import java.util.*;

public class Problem2237A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

            long ans = 0;
            int mn = Integer.MAX_VALUE;

            for (int i = n - 1; i >= 0; i--) {
                mn = Math.min(mn, a[i]);
                ans += mn;
            }

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}
