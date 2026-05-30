package Codeforces_Problem;

import java.util.*;

public class Problem1030A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hard = false;

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                hard = true;
            }
        }

        System.out.println(hard ? "HARD" : "EASY");
    }
}
