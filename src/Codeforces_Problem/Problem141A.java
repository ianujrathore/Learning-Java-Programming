package Codeforces_Problem;

import java.util.*;

public class Problem141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        if (s1.length() + s2.length() != s3.length()) {
            System.out.println("NO");
            return;
        }

        int[] freq = new int[256];

        for (char c : (s1 + s2).toCharArray()) {
            freq[c]++;
        }

        for (char c : s3.toCharArray()) {
            freq[c]--;
            if (freq[c] < 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
