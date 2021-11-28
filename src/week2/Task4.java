package week2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // 4. What happens if concatenate string and another primitive type
        //concatenate integer + integer, print output
        //concatenate String + integer with other primitive types.
        //Example of output` 5 + 10 = 15 (edited)

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter int type of input");
        int concatInt = scanner.nextInt();
        System.out.println("please enter second int type of number ");
        int concatInt2 = scanner.nextInt();
        int conted = concatInt + concatInt2;
        System.out.println(concatInt + "+" + concatInt2 + " = " + conted);


        System.out.println("Now please enter String type of input ");
        String str = scanner.nextLine();
        System.out.println("Please enter Int type of input ");
        int into = scanner.nextInt();
        String strconc = str + into;
        System.out.println("Concated String and Int is  //  " + strconc);


    }
}
