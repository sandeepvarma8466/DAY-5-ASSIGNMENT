package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        float sum = 0;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("1/"+i);
            sum = sum + (float)1/i;
        }
        System.out.println("sum: " + sum);
    }
}
