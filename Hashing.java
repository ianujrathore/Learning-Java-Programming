import java.util.Scanner;

class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute using HashMap
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print("Enter q: ");
        int q = sc.nextInt();

        System.out.println("Enter query numbers:");
        while (q-- > 0) {
            int number = sc.nextInt();
            System.out.println(hash.getOrDefault(number, 0));
        }

        sc.close();
    }
}
