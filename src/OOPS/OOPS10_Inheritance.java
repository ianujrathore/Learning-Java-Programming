package OOPS;

public class OOPS10_Inheritance {
    public static class Animal {
        String name;
        int age;

        void print() {
            System.out.println("Name : "+name+"\nage : "+ age);
        }

        void eat(){
            System.out.println("Animal is Eating");
        }
    }

    public static class Dog extends Animal {
        Dog (String name, int age){
            this.name = name;
            this.age = age;
        }
        void bark(){
            System.out.println("Dog is Barking");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog("Bruno",3);
        d.print();
        d.eat();
        d.bark();
    }
}
