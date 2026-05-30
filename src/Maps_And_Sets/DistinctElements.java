package Maps_And_Sets;

import java.util.HashSet;

public class DistinctElements {
    public static void main(String[] args) {
        int [] arr = {2,2,3,2,3,2,1,1,5};

        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        System.out.println("Size : " + set.size());
        System.out.println(set);
    }
}
