package OOPS;

public class OOPS07_Constructor {
    public static class Ben10 {
        String alienName;
        int power;

        // Default Constructor
        Ben10() {
        }

        // Parameterized Constructor
        Ben10(String n, int p) {
            alienName = n;
            power = p;
        }

        // Copy Constructor
        Ben10(Ben10 other) {
            this.alienName = other.alienName;
            this.power = other.power;
        }

        void print() {
            System.out.println("Alien Name: " + alienName);
            System.out.println("Power: " + power);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Using Default Constructor
        Ben10 b1 = new Ben10();
        b1.alienName = "FourArms";
        b1.power = 100;

        // Using Parameterized Constructor
        Ben10 b2 = new Ben10("HeatBlast", 95);

        // Using Copy Constructor
        Ben10 b3 = new Ben10(b2);
        b3.alienName = "DiamondHead";
        b3.power = 98;

        b1.print();
        b2.print();
        b3.print();
    }
}