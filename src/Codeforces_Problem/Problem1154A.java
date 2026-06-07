package Codeforces_Problem;

import java.util.*;

public class Problem1154A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sum = arr[3];

        System.out.println((sum - arr[0]) + " " + (sum - arr[1]) + " " + (sum - arr[2]));
    }
}
