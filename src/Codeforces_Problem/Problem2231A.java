package Codeforces_Problem;

import java.io.*;

public class Problem2231A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 1; i <= n; i++) {
                if (i > 1) out.append(' ');
                out.append(n + i);
            }
            out.append('\n');
        }
        System.out.print(out);
    }
}
