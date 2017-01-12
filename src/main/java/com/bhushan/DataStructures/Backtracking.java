package com.bhushan.DataStructures;

import java.util.Arrays;

/**
 * Created by bhushan on 12/22/16.
 */
public class Backtracking {
    private int[] test;

    private Backtracking(int n) {
        test = new int[n];
    }
    private void Binary(int n) {
        if (n < 1)
            System.out.println(Arrays.toString(test));
        else {
            test[n-1] = 0;
            Binary(n-1);
            test[n-1] = 1;
            Binary(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        Backtracking b = new Backtracking(n);
        b.Binary(n);
    }


}
