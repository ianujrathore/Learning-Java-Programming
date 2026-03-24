package Methods_In_Java;

public class Syntax {
    public static void method1(){
        System.out.println("Hello!");
        method2();
    }
    public static void method2(){
        System.out.println("This is method in java");
        method3();
    }
    public static void method3(){
        System.out.println("Have a nice day!");
    }
    public static void main(String[] args) {
        method1();
    }
}
