package Arrays;

import java.util.Arrays;

public class ShallowCopyAndDeepCopy {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
        int [] x = arr;         // x is shallow copy of arr
        x[0] = 100;
        System.out.println(arr[0]);

        int [] deep = Arrays.copyOf(arr,arr.length);   // Deep Copy
        deep[0] = 10;
        System.out.println(arr[0]);
    }
}
