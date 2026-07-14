package Codeforces_Problem;

import java.util.*;
 
public class Problem1829A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        String target = "codeforces";
 
        while (t-- > 0) {
            String s = sc.next();
            int count = 0;
 
            for (int i = 0; i < target.length(); i++) {
                if (s.charAt(i) != target.charAt(i)) {
                    count++;
                }
            }
 
            System.out.println(count);
        }
 
        sc.close();
    }
