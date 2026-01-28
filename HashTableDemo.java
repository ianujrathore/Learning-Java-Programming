// Import Hashtable class
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {

        // Step 1: Create a Hashtable
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Step 2: Add some data (key -> value)
        ht.put("John", 25);
        ht.put("Mary", 30);
        ht.put("Steve", 28);
        ht.put("Alice", 22);
        ht.put("Bob", 24);

        // Step 3: Print the entire Hashtable
        System.out.println("Hashtable: " + ht);

        // Step 4: Access a value using key
        System.out.println("Age of Mary: " + ht.get("Mary"));

        // Step 5: Check if a key exists
        System.out.println("Is John in hashtable? " + ht.containsKey("John"));

        // Step 6: Remove a key-value pair
        ht.remove("Steve");
        System.out.println("After removing Steve: " + ht);

        // Step 7: Loop through all entries
        System.out.println("All key-value pairs:");
        for (String key : ht.keySet()) {
            System.out.println(key + " -> " + ht.get(key));
        }
    }
}
