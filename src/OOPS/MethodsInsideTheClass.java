package OOPS;

public class MethodsInsideTheClass {
    public static class SmartPhone {
        String name;
        String model;
        int price;

        void print(){
            System.out.println("Company : " + name + " Model : " + model + " Price : " + price);
        }
    }

    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        s1.name = "Vivo";
        s1.model = "Vivo T1 5G";
        s1.price = 16999;

        SmartPhone s2 = new SmartPhone();
        s2.name = "Apple";
        s2.model = "iphone 17";
        s2.price = 100000;

        s1.print();
        s2.print();
    }
}
