/*
Given two integers (weights), repeatedly multiply one by 3 and the other by 2 each year,
and find how many years it takes for the first to become strictly greater than the second.
*/
package Codeforces_Problem;

import java.util.Scanner;

public class Problem791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while (a<=b){
            a *= 3;
            b *= 2;
            count++;
        }
        System.out.println(count);
    }
}
