package Arrays;

import java.util.*;

public class ArrayListJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);  // Add element in ArrayList using add
        arr.add(20);
        arr.add(30);
        arr.add(40);

        System.out.println(arr.get(2));   // Access Index using get

        arr.set(3,50);  // Replace element in ArrayList using set
        System.out.println(arr);

        int n = arr.size();  // Similar to arr.length to access length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        // Add in between of element
        arr.add(3,40);
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);
    }
}
