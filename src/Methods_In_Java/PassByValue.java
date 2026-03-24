package Methods_In_Java;

public class PassByValue {
    public static void change(int x){       // Pass copy of value not original value
        x = 10;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
