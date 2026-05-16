package Codeforces_Problem;

import java.util.*;

public class Problem734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int anton = 0, danik = 0;

        for (char c : s.toCharArray()) {
            if (c == 'A') {
                anton++;
            } else {
                danik++;
            }
        }

        if (anton > danik) {
            System.out.println("Anton");
        } else if (danik > anton) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
