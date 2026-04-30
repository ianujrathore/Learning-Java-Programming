// Find out the year having all distinct number!!
package Codeforces_Problem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        while (true) {
            year++;
            if (isBeautiful(year)) {
                System.out.println(year);
                break;
            }
        }
    }

    static boolean isBeautiful(int year) {
        String s = String.valueOf(year);
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
