package Strings;

public class StringToCharArray {
    public static void main(String[] args) {
        String str = "SpiderMan";

        char [] arr = str.toCharArray();
        for(char ch : arr){
            System.out.print(ch + " ");
        }
    }
}
