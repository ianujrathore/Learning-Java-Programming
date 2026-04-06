package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BasicOfArrayList {
        public static void main(String[] args) {
            ArrayList<Integer> nums = new ArrayList<>();

            // Add Elements in ArrayList Using "nums.add"
            nums.add(10);
            nums.add(20);
            nums.add(30);
            nums.add(40);

            // Access Index/Elements in ArrayList Using "nums.get()"
            System.out.println(nums.get(2));

            // Replace Elements in ArrayList Using "nums.set()"
            nums.set(3,50);
            System.out.println(nums);

            // To Find length in ArrayList "nums.size()"
            int n = nums.size();
            for(int i = 0; i < n; i++) {
                System.out.print(nums.get(i) + " ");
            }
            System.out.println();

            // Add Element at AnyPlace
            nums.add(3,40);
            System.out.println(nums);

            Collections.reverse(nums);
            System.out.println(nums);
        }
}
