package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a = sc.nextInt();
        System.out.println("Enter the value of b " );
        b = sc.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("After swapping value of a is : " + a);
        System.out.println("After swapping value of b is : " + b);
    }
}
