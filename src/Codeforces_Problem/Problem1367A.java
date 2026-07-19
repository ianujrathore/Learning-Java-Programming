package Codeforces_Problem;

import java.util.*;

public class Problem1367A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String b = sc.next();
            StringBuilder ans = new StringBuilder();
            ans.append(b.charAt(0));
            ans.append(b.charAt(1));

            for (int i = 3; i < b.length(); i += 2) {
                ans.append(b.charAt(i));
            }

            System.out.println(ans);
        }
    }
}
