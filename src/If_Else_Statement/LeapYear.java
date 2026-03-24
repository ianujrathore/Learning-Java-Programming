package If_Else_Statement;

import java.util.*;

public class LeapYear {
    public static void isLeapYear (int year){
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Leap Year");
        } else if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        isLeapYear(year);
        sc.close();
    }
}
