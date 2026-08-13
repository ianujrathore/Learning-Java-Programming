package Strings;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Spider Man";

        // Print String
        System.out.println(name);

        // Get the size of String
        System.out.println(name.length());

        // Get char at particular index
        System.out.println(name.charAt(7));

        // Access Index from back
        System.out.println(name.charAt(name.length()-3));

        // Print string using loop
        for(int i = 0; i < name.length(); i++){
            System.out.print(name.charAt(i));
        }

        System.out.println();

        // String to Array
        char [] arr = name.toCharArray();
        for(char ele : arr){
            System.out.print(ele + " ");
        }

        System.out.println();

        // Array to String
        char [] arr2 = {'A','p','p','l','e'};
        String fruit = new String(arr2);
        System.out.println(fruit);

        System.out.println(name.substring(7));
        System.out.println(name.substring(3,7));
        System.out.println(name.indexOf("Man"));
    }
}
