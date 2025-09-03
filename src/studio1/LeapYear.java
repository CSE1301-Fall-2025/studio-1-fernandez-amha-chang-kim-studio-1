package studio1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
    Scanner n1 = new Scanner(System.in);
    System.out.println("What year do you want to check?");
    int year = n1.nextInt();
    int Dfour = year % 4;
    int Dhun = year % 100;
    int Dfh = year % 400;
    boolean leapyear = (Dfour == 0 ) && (Dhun !=  0) || (Dfh == 0);

    System.out.println(year + " is a leapyear: " + leapyear);

    }
}
