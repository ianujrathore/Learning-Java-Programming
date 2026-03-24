package Methods_In_Java;

public class ReturnType {
    public static int isReturn(){
        System.out.println("This is example of return type");
        return 5;
    }

    public static void main(String[] args) {
        isReturn();

        int x = isReturn();
        System.out.println(x);
    }
}
