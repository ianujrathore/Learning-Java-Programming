package ArrayList;

import java.util.ArrayList;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            list.add(i * 10);
        }
        System.out.println(list);
        System.out.println("Size of List : " + list.size());

        int sum = 0;
        for(int i = 0; i < list.size();i++){
            sum += list.get(i);
        }
        System.out.println("Sum of List : " + sum);
    }
}
