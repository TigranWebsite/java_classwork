package week2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Narrowing Primitive Conversion (Explicit)
        // 2. Write java program, which has double type variable(Input variable from console)
        //Cast double to float,print both variables
        //Cast float to long, print both variables
        //Cast long to int, print both variables
        //Cast int to short, print both results
        //Cast short to byte, print both results
        /** @Tigran Babasyan */

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter double type in to float, dont worry it wont crash, it  will cast to double ");
        double d = scanner.nextDouble();
        float fll = (float) d;
        System.out.println("double d = "+d+" , narrowing to float "+fll);
        System.out.println("----------------");
        System.out.println("Please enter float type for casting to Long ");
        float fl2 = scanner.nextFloat();
        long lc2 = (long) fl2;
        System.out.println("float fl2 = "+fl2+" , casted to LONG = "+lc2);
        System.out.println("------------");
        System.out.println("Please enter INT type of input for for making litle bit not much litle bit shorter ");
        int in2 = scanner.nextInt();
        short ins2 = (short) in2;
        System.out.println("int = "+ins2+" , shorted int is "+ins2);
        System.out.println("--------------------");
        System.out.println("Please in this time enter Short type for casting to byte ");
        short sh2 = scanner.nextShort();
        int ins3 = (int) sh2;
        System.out.println("int that became a short is  "+ins3+ " , and this that shortone that became a short from int "+sh2);











    }
}
