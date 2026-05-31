package Codeforces_Problem;

import java.util.*;

public class Problem268A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] home = new int[n];
        int[] guest = new int[n];

        for (int i = 0; i < n; i++) {
            home[i] = sc.nextInt();
            guest[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (home[i] == guest[j]) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
