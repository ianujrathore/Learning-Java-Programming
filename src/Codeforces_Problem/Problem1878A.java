package Codeforces_Problem;

import java.util.*;
import java.io.*;

public class Problem1878A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            boolean found = false;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st2.nextToken());
                if (x == k) found = true;
            }
            sb.append(found ? "Yes" : "No").append("\n");
        }
        System.out.print(sb);
    }
}
