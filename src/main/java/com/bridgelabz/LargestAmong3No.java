package com.bridgelabz;

import java.util.Scanner;

public class LargestAmong3No {
    public static void main(String[] args) {
        System.out.println("Enter Three Numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();;
        int b = sc.nextInt();;
        int c = sc.nextInt();

        int big = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest among given three numbers is :"+big);

        //using ssimple if-else-if statement
        /*if (a>b && a>c) {
            System.out.println("Largest number is : "+a);
        }
        else if (b>a && b>c) {
            System.out.println("Largest number is : "+b);
        }
        else {
            System.out.println("Largest number is : "+c);
        }*/
    }
}
