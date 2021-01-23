package com.tts;

import java.util.Scanner;

// Java Introduction Slide 49 -Guessing Game
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Guess a lucky number between 1 - 100");
        int num = input.nextInt();

            if (num > 10 && num < 16) {
                System.out.println("Wow! your guess is correct.");
                System.exit(0);
                 } else

                    {
                    for (num = 0; num < 4; num++) {

                    System.out.println("nope! Try again.");
                    int num1 = input.nextInt();

                        }
                    }
               
               System.out.println("You reached the limitation. Try it later again.");
           }
        }

