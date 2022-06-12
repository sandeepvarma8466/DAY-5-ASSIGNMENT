package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Enter a divisor : ");
        int i = sc.nextInt();
        System.out.println("Quotient of Number : " + n/i);
        System.out.println("Remainder of Number : " + n%i);
    }
}
