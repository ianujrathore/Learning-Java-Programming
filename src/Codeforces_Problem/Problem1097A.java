package Codeforces_Problem;

import java.util.*;

public class Problem1097A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String table = sc.next();
        boolean ok = false;

        for (int i = 0; i < 5; i++) {
            String card = sc.next();
            if (card.charAt(0) == table.charAt(0) ||
                card.charAt(1) == table.charAt(1)) {
                ok = true;
            }
        }

        System.out.println(ok ? "YES" : "NO");
    }
}
