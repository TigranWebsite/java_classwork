package week2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        // Write java program, which has byte type variable(Input variables from console)
        //Cast byte to short type, print both variables
        //Cast short to int type, print both variables
        //Cast int to long, print both variables
        //Cast long to float, print both variables
        //Cast float to double type, print both variables

        /** @Tigran Babasyan **/

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter byte input ");
        byte b= scanner.nextByte();
        System.out.println("please enter short input ");
        short sh =scanner.nextShort();
        System.out.println("please enter int type input ");
        int in = scanner.nextInt();
        System.out.println("please input Long type input");
        long lo = scanner.nextLong();
        System.out.println("please input float type input ");
        float fl = scanner.nextFloat();
        System.out.println("please input double input ");
        double db= scanner.nextDouble();
        System.out.println("Thanks Million ");

        short sc = b;
        int ic=sh;
        long lc=in;
        float fc = lo;
        double dc = fl;


        System.out.println("byte b = "+b+", cast to short ="+sc);
        System.out.println("short sh = "+sh+", cast to int = "+ic);
        System.out.println("int in = "+in+", cast to Long = "+lc);
        System.out.println("Long = "+lo+", cast to Float = "+fc);
        System.out.println("double = "+fl+", cast to float = "+dc);





    }
}
