import java.util.*;

public class Problem492A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int level = 0;

        while (sum + (level + 1) * (level + 2) / 2 <= n) {
            level++;
            sum += level * (level + 1) / 2;
        }

        System.out.println(level);
    }
}
