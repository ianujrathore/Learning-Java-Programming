package OOPS;

class Employee {
    String name;
    private int salary;

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    int  getSalary() {
        return salary;
    }

    void  setSalary(int x) {
        salary = x;
    }
}

public class PrivateKeyword {


    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Spiderman";
        emp.setSalary(15000);

        Employee emp2 = new Employee();
        emp2.name = "Peter Parker";
        emp2.setSalary(20000);

        emp.print();
        emp2.print();
    }
}
