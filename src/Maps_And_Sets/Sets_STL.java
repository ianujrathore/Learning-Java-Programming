package Maps_And_Sets;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets_STL {
    public static void main(String[] args) {
        //HashSet<Integer> set = new HashSet<>();  //Unordered Set
        TreeSet<Integer> set = new TreeSet<>();  //Ordered Set
        set.add(7);
        set.add(45);
        set.add(18);

        System.out.println(set.size());
        System.out.println(set);
    }
}
