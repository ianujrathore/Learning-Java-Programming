package Arrays;

import java.util.*;

public class SumOfArray {
    public static int sum(int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
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
        System.out.println(sum(arr));
        sc.close();
    }
}
