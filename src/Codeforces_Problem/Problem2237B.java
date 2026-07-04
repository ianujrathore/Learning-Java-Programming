package Codeforces_Problem;

import java.io.*;
import java.util.*;

public class Problem2237B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String line = br.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }

            int n = Integer.parseInt(line);

            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int[] b = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            boolean[] used = new boolean[n];
            long ans = 0;
            boolean ok = true;

            for (int i = 0; i < n && ok; i++) {
                boolean found = false;

                for (int j = 0; j < n; j++) {
                    if (!used[j] && a[j] <= b[i]) {
                        used[j] = true;
                        found = true;
                        break;
                    }
                    if (!used[j]) ans++;
                }

                if (!found) ok = false;
            }

            System.out.println(ok ? ans : -1);
        }
    }
}
