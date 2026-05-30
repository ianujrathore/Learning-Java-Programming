package OOPS;

public class UserDefinedDataType {
    public static class Student {
        String name;
        int age;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Zayn";
        s1.age = 21;
        s1.rno = 18;
        s1.cgpa = 7.9;

        Student s2 = new Student();
        s2.name = "Sam";
        s2.age = 20;
        s2.rno = 15;
        s2.cgpa = 9.0;

        System.out.println(s1.name + " " + s1.age + " " + s1.rno + " " + s1.cgpa);

    }
}
