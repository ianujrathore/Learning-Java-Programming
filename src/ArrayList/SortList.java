package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(15);
        list.add(7);

        Collections.sort(list);
        System.out.println(list);
    }
}
