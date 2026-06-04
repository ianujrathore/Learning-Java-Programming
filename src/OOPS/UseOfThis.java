package OOPS;

public class UseOfThis {

    String name;
    int age;

    UseOfThis(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        UseOfThis obj = new UseOfThis("Ben Tennyson", 10);
        obj.display();
    }
}