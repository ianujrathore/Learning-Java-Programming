package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static int sMax(int [] nums){
        int n = nums.length;
        int largest = nums[0];
        int slargest = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
            if(nums[i] > slargest && nums[i] != largest){
                slargest = nums[i];
            }
        }
        return slargest;
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

        System.out.println(sMax(array));
        sc.close();
    }
}
