package Strings;

public class PassingStringToMethod {
    public static void change(String x){
        x = "SpiderMan";
    }
    public static void main(String[] args) {
        String x = "Peter Parker";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
