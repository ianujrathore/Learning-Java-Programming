package Strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int i = 0;
        int j = str.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        System.out.println(isPalindrome);
        sc.close();
    }
}