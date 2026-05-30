package Maps_And_Sets;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        int target = 5;
        HashSet <Integer> set = new HashSet<>();
        for(int ele : arr){
            int rem = target - ele;
            if(set.contains(rem))
                System.out.println(true);
            set.add(ele);
        }
    }
}
