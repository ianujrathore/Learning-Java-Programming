package Strings;

import java.util.Scanner;

public class SumOfSubString {
    public static int sum(String str){
        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j <= str.length(); j++){
                String s = str.substring(i,j);
                int n = Integer.parseInt(s);
                sum += n;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Sum : " + sum(str));
    }
}
