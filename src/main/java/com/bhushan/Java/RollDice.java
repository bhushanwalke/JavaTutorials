package com.bhushan.Java;

import java.security.SecureRandom;

/**
 * Created by bhushan on 12/28/16.
 */
public class RollDice {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();

        int freq1 = 0;
        int freq2 = 0;
        int freq3 = 0;
        int freq4 = 0;
        int freq5 = 0;
        int freq6 = 0;

        for (int roll = 1; roll <= 6000000; roll++) {
            int face = 1 + randomNumber.nextInt(6);

            switch (face) {
                case 1:
                    ++freq1;
                    break;
                case 2:
                    ++freq2;
                    break;
                case 3:
                    ++freq3;
                    break;
                case 4:
                    ++freq4;
                    break;
                case 5:
                    ++freq5;
                    break;
                case 6:
                    ++freq6;
                    break;
            }
        }

        System.out.println("Face frequency");
        System.out.printf("1: %d%n" +
                "2: %d%n" +
                "3: %d%n" +
                "4: %d%n" +
                "5: %d%n" +
                "6: %d%n",
                freq1, freq2, freq3, freq4, freq5, freq6);
    }
}
