package Codeforces_Problem;

import java.util.*;

public class Problem520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next().toLowerCase();

        boolean[] seen = new boolean[26];

        for (char c : s.toCharArray()) {
            seen[c - 'a'] = true;
        }

        for (boolean x : seen) {
            if (!x) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
