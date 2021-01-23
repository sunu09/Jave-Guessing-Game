package com.tts;

import java.util.Scanner;

// Java Introduction Slide 49 -Guessing Game
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Guess a lucky number between 1 - 100");
        int num = input.nextInt();

            if (num > 0 && num < 11) {
                System.out.println("wow");
            } else if (num > 5 && num < 16) {
                System.out.println("so close");
            } else {
                System.out.println("nope! Try again.");
            }

        // score
        System.out.println("What is your score?");
        int score = input.nextInt();
        int baseScore = 60;
        if (score >baseScore) {
            System.out.println("You have passed.");
        } else {
            System.out.println("YOu have failed.");
        }

    }
}
