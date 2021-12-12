package week2;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        // 6. Generate and print random integer number between 2 to 7(not using bound)
        Random random = new Random();
        int randMin = 2;
        int randMax = 7;

        int rand = (int) Math.floor(Math.random() * (randMax - randMin + 1) + randMin);
        System.out.println(rand);


    }
}
