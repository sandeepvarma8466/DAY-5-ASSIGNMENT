package com.bridgelabz;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int n, i, result = 0;
        System.out.println("Enter a value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i=1; i<=n; i+=31) {
            if (n<31) {
                result = (int) Math.pow(2,n);
            }
            else {
                System.out.println("Invalid input");
            }
        }
        System.out.println("Power of 2: " +result);
    }
}
