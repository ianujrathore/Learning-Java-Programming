package Arrays;

import java.util.*;

class LinearSearch {
    public static void search(int[] arr, int target){
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element found at Index : " + i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Element not found!");
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

        System.out.println("Enter Target : ");
        int target = sc.nextInt();

        search(array, target);
    }
}