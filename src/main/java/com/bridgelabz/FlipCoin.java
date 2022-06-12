package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("Give a number");
        Scanner sc = new Scanner(System.in);
        int headCount = 0;
        int tailCount = 0;
        int count = sc.nextInt();

        for (int i=0; i<count; i++) {
            double random = Math.random();
            if (random<0.5) {
                tailCount++;
            }
            else {
                headCount++;
            }
        }
        System.out.println("percentage of tails("+tailCount+"):"+(tailCount*100f/(headCount+tailCount)));
        System.out.println("percentage of heads("+headCount+"):"+(headCount*100f/(headCount+tailCount)));
    }
}
