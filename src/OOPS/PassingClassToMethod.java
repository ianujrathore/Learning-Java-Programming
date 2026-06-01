package OOPS;

public class PassingClassToMethod {
    public static class Car {
        String name;
        int seats;
        double price;
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.name = "Mercedes";
        c.seats = 6;
        c.price = 20000000;

        change(c);

        System.out.println(c.seats);
    }

    public static void change(Car c){
        c.seats = 5;
    }
}
