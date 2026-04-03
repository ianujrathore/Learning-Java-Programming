package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void revArray(int [] nums){
        int n = nums.length;
        int j = n - 1;
        for(int i = 0; i < j; i++){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
        }
        for(int ele : nums) System.out.print(ele + " ");
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

        revArray(array);
        sc.close();
    }
}
