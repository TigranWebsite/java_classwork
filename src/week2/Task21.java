package week2;

import java.util.Scanner;

public class Task21 {
    /*
    21.Enters 2 integer numbers : x and d from console
Count and print one number - how many times the digit d occurs in the representation of a natural number x
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter X number ");
        int x = scanner.nextInt();
        int d = 3;
        int temp = 0;
        int count = 0;
        /*for (int i = 0; i < x; i++) {
            x = x / 10;
            count++;
            if (count == d) {
                count++;
                System.out.println(count + " count ");
            }*/
        while (x != 0) {
            temp = x % 10;
            if (d == temp) {
                count++;
            }
            x /= 10;
        }
        System.out.println("ther is " + count + " time " + " " + d);
    }

}
