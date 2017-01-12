package com.bhushan.Java.Arrays;

import java.security.SecureRandom;

/**
 * Created by bhushan on 12/29/16.
 */
public class StudentPoll {
    private final static int[] responses = new int[20];

    public static void main(String[] args) {
        SecureRandom numberGenerator = new SecureRandom();

        for(int i=0; i<responses.length; i++) {
            responses[i] = 1 + numberGenerator.nextInt(5);
        }
        responses[0] = 14;

        int[] frequency = new int[6];

        for (int answer=0; answer <responses.length; answer++) {
            try {
                ++frequency[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e + " for \n" + responses[answer]);
            }
        }

        for (int rating=1; rating < frequency.length; rating++) {
            System.out.println(rating + " : " + frequency[rating]);
        }
    }
}
