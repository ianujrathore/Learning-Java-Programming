package Arrays;

import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void print(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {30, 48, 50, 83, 59, 30,29};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
}
