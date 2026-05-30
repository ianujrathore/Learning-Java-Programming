package Codeforces_Problem;

import java.util.Scanner;

public class Problem677A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfFriends = sc.nextInt();
        int heightOfFence = sc.nextInt();

        int [] height = new int[numberOfFriends];
        int width = 0;
        for(int i = 0; i < height.length; i++){
            height[i] = sc.nextInt();

            if(height[i] > heightOfFence){
                width+=2;
            } else {
                width+=1;
            }
        }
        System.out.println(width);
    }
}