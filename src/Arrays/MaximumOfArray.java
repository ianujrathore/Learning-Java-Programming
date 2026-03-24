package Arrays;

import java.util.*;

public class MaximumOfArray {
    public static int maximum(int [] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array : ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.print("Enter the elements of the Array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maximum(arr));
        sc.close();
    }
}
