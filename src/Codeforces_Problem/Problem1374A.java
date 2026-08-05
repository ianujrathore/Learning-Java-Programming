import java.util.*;

public class Problem1374A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();

            long k = (n / x) * x + y;

            if (k > n) {
                k -= x;
            }

            System.out.println(k);
        }

        sc.close();
    }
}
