package Codeforces_Problem;

import java.util.*;

public class Problem1950A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a < b && b < c){
                System.out.println("STAIR");
            } else if (a < b && b > c){
                System.out.println("PEAK");
            } else {
                System.out.println("NONE");
            }
        } 
    }
}
