package week2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Write a Java program to allow the user to input his/her age.
        // Then the program will show if the person is eligible to vote.
        // A person who is eligible to vote must be older than or equal to 18 years old.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age ");
        boolean bf = true;
        while (bf) {
            int age = scanner.nextInt();

            if (age <= 0 || (age >= 120)) {
                System.out.println("Please Enter your real age ");

            }

            if (age >= 18 && (age <= 119)) {
                System.out.println("you are eligable to vote");
                bf = false;
            }
        }

    }
}
