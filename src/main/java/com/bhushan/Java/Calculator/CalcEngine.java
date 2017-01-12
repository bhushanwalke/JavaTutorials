package com.bhushan.Java.Calculator;

/**
 * Created by bhushan on 12/24/16.
 */
public class CalcEngine {

    public static void main(String[] args) {
        int[] leftVals = {10, 20, 30, 70};
        int[] rightVals = {40, 50, 60, 80};
        char[] opcodes = {'a', 's', 'd', 'm'};
        int[] results = new int[4];

        for(int i=0; i<opcodes.length; i++) {
            switch (opcodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0;
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
            }
        }

        for (int i: results) {
            System.out.println(i);
        }
    }
}
