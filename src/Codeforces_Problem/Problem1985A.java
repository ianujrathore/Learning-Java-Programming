package Codeforces_Problem;

import java.io.*;
import java.util.*;

public class Problem1985A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            sb.append(b.charAt(0)).append(a.substring(1)).append(" ")
              .append(a.charAt(0)).append(b.substring(1)).append("\n");
        }
        System.out.print(sb);
    }
}
