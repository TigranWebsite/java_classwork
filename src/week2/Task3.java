package week2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //  .Compute area and perimeter of circle.(Input double type radius from console)(PI = 3.14159)


        /** Tigran Babasyan */

        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double pi = 3.14159;
        double meter = 2 * pi * radius;
        double area = pi * radius * radius;

        System.out.println("meter is = " + meter);
        System.out.println("area is = " + area);

    }
}
