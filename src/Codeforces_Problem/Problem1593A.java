package Codeoforces_Problem;

import java.util.*;

public class Problem1593A {
    static int solve(int x, int y, int z) {
        return Math.max(0, Math.max(y, z) + 1 - x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(
                solve(a, b, c) + " " +
                solve(b, a, c) + " " +
                solve(c, a, b)
            );
        }
    }
}
