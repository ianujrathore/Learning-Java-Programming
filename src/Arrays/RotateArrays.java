package Arrays;

import java.util.Scanner;

public class RotateArrays {
    public static void rotateArray(int [] nums, int d){
        int n = nums.length;
        d %= n;

        reverse(nums,0,d-1);
        reverse(nums,d,n-1);
        reverse(nums,0,n-1);

        for(int ele : nums) System.out.print(ele + " ");
    }

    public static void reverse(int[] nums, int i , int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        System.out.println("Enter the element of the array : ");
        int [] array = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the distance : ");
        int d = sc.nextInt();

        rotateArray(array,d);
        sc.close();
    }
}