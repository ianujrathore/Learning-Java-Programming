package Codeforces_Problem;

import java.util.*;

public class Problem1619A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int n = s.length();
          
            if (n % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            String firstHalf = s.substring(0, n / 2);
            String secondHalf = s.substring(n / 2);

            if (firstHalf.equals(secondHalf)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
