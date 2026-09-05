package OOPS;

public class OOPS08_UseOfThis {

    String name;
    int age;

    OOPS08_UseOfThis(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        OOPS08_UseOfThis obj = new OOPS08_UseOfThis("Ben Tennyson", 10);
        obj.display();
    }
}