package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter the value of the year");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Non Leap Year");
        }
    }
}
