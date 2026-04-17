package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70,80,90,100};

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int low = 0, high = nums.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                System.out.println("Target found at index " + mid);
                found = true;
                break;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Target not found");
        }
        sc.close();
    }
}