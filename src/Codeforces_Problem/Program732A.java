package Codeforces_Problem;

import java.util.*;

public class Problem732A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();

        int n = 1;
        while (true) {
            int x = (k * n) % 10;
            if (x == 0 || x == r) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
