package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,4,6,8,10};

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        int [] arr2 = new int [5];

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}
