package pl.coderslab.arrays;

import java.util.Random;

public class Main02 {

    public static void main(String[] args) {
        Random rand = new Random ();
        int[] randNumbers = new int [20];
        for (int i = 0; i < randNumbers.length; i++){
            randNumbers[i] = rand.nextInt(100);
        }



    }
}
