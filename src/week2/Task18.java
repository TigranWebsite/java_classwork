package week2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
    /*    18. Write a java program to print all even numbers from a
        given range, from a to b. Input a and b from console.Example`
        Input ` 2 Output ` 2 4
        5*/
        Scanner scanner = new Scanner(System.in);
        boolean bollTry = true;
        while (bollTry) {


            System.out.println("Please enter a  reng  number start from  ");
            int lowerRange = scanner.nextInt();
            System.out.println("Please enter a  reng  number Ends To ");
            int evenNumberH = scanner.nextInt();
            System.out.println("List of even numbers from " + lowerRange + " to " + evenNumberH + ": ");

            if (lowerRange >= evenNumberH) {
                System.out.println("Please start number must be lower than last number, ");
                System.out.println("Enter propper number range");
            } else
                for (int i = lowerRange; i < evenNumberH; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + ", ");
                        bollTry = false;
                    }

                }
        }

        /////////////////////  /////////////////////////
        // hi Davit or Anahit this is second version of this Task,
        // just  comment the code above and uncomment this code and RUN
        /////////////////////////////////


        /*
         System.out.println("Please enter a number for range A: ");
        int a = scanner.nextInt();
        System.out.println("Please enter a number for range B: ");
        int b = scanner.nextInt();
        int temp = 0;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + ", ");
                }
            }


        }
        */


    }
}
