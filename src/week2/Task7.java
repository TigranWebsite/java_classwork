package week2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
       /*  7. Input from console int a and int b, if a and b corresponds for
          following requirements print “Both a and b legal”, if any of them does not
         correspond print about it like this “a is legal b is illegal ''. or vice versa
            7.1 !   a > 10 and b is not equal to 10
            7.2 !  both a and b is positive
            7.3 !  both a and b is negative
            7.4 !  a > 10 b < 1 both of them are odd
            7.5 ! a is a multiple of 5 OR b is a multiple of 5
            7.6    a is not a multiple of 5 but b is a multiple of 5   */

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number for 'a'");
        int a = scanner.nextInt();
        System.out.println("please enter a number for 'b");
        int b = scanner.nextInt();
        int c = 0;
        if (a > 10 && b != 10) {
            System.out.println("A is bigger 10 and it is " + a + " , and B is not 10 and it is , " + b);

        }
        if (a >= 0 && b >= 0) {
            System.out.println("A is possitive and it is " + a + " , and B is possitiv and it is , " + b);
        }
        if (a < 0 && b < 0) {

            System.out.println("A is Negative and it is " + a + " , and B is Negative and it is , " + b);
        }
        if (a > 10 || b < 1 && a % 2 == 1 && b % 2 == 1) {
            // 7.4  a > 10 b < 1 both of them are odd
            System.out.println("A is ODD and bigger than 10 and it is " + a + " , and B is ODD and smaller than 1 and it is , " + b);
        }
        if (a % 5 == 0 && b % 5 == 0) {
            // a is a multiple of 5 OR b is a multiple of 5
            System.out.println("A is MULTIPLE 5 and it is " + a + " , and B is MULTIPLE 5 and it is , " + b);
        }
        if (a % 5 != 0 && b % 5 != 0) {
            //  a is not a multiple of 5 but b is a multiple of 5
            System.out.println("A is NOT MULTIPLE 5 and it is " + a + " , and B is NOT MULTIPLE and it is , " + b);
        } else {
            System.out.println("you didn't entered any number for my criteria ");
        }


    }
}
