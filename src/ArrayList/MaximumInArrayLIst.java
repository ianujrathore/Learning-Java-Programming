package ArrayList;

import java.util.ArrayList;

public class MaximumInArrayLIst {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(9);
            list.add(2);
            list.add(15);
            list.add(7);

            int max = list.get(0);

            for(int i = 0; i < list.size(); i++){
                if(list.get(i) > max){
                    max = list.get(i);
                }
            }
            System.out.println("Max : " + max);
        }
}
