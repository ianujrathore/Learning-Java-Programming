package Strings;

public class BuiltInMethods {
    public static void main(String[] args) {
        String str = "SpiderMan";
        System.out.println(str.indexOf('o'));
        System.out.println(str.contains("Man"));
        System.out.println(str.startsWith("Spider"));

        String str2 = "Super";
        String str3 = "Man";
        System.out.println(str2.concat(str3));

        // String to integer
        String s = "12345";
        int n = Integer.parseInt(s);
        System.out.println(n);

        // Integer to string
        int num = 23432;

        String s1 = Integer.toString(num);
        System.out.println(s1);
    }
}
