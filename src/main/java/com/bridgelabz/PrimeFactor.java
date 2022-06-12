package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        int is_prime = 1;
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=2; i<=n; i++) {
            if (n % i == 0) {
                System.out.println(i + "\t");
            }
        }
        System.out.println();

    }
}
