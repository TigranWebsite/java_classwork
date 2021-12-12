package week2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        /* 8. Input int values a and b from console
               if one of them is multiple of 7, and both positive, and a greater than b, print all odd values between them
               else print all even values between them
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number for 'a'");
        int a = scanner.nextInt();
        System.out.println("please enter a number for 'b'");
        int b = scanner.nextInt();

//if one of them is multiple of 7, and both positive, and a greater than b,
        if (a % 7 == 0 && b % 7 == 0 && a >= 0 || b >= 0 && a > b) {
            for (int i = 1; i <= a; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " odd A  ");
                }
                System.out.println(" ");
                for (int j = 0; j < b; j++) {
                    if (j % 2 != 0) {
                        System.out.print(j + " Odd B  ");
                    }
                }


            }
            for (int i = 1; i <= a; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " Even A  ");
                }
                System.out.println(" ");
                for (int j = 0; j < b; j++) {
                    if (j % 2 == 0) {
                        System.out.print(j + " Even B  ");
                    }
                }


            }

        }


    }
}



