package OOPS;

public class MethodsOutsideTheClass {
    public static class SmartPhone {
        String name;
        String model;
        int price;
    }

    public static void main(String[] args) {
        SmartPhone sp1 = new SmartPhone();
        sp1.name = "Vivo";
        sp1.model = "Vivo T1 5G";
        sp1.price = 16999;

        SmartPhone sp2 = new SmartPhone();
        sp2.name = "Apple";
        sp2.model = "iphone 17";
        sp2.price = 119999;

        print(sp1);
        print(sp2);
    }
    public static void print(SmartPhone obj){
        System.out.println("Company : " + obj.name + " Model : " + obj.model + " Price : " + obj.price);
    }
}
