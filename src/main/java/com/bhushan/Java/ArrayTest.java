package com.bhushan.Java;

/**
 * Created by bhushan on 12/24/16.
 */
public class ArrayTest {
    private static int[] vals = new int[4];
    private static int[] vals1 = {1, 2, 3, 4, 5};

    private static String[][] arr2d = new String[5][5];

    public static void main(String[] args) {
        for (int i=0; i<vals.length; i++) {
            vals[i] = i+1;
        }

        for (int i: vals) {
            System.out.println(i);
        }

        for (int i: vals1) {
            System.out.println(i);
        }

        for (int i=0; i<arr2d.length; i++) {
            for (int j=0; j<arr2d[i].length; j++) {
                arr2d[i][j] = String.valueOf(i) + String.valueOf(j);
            }
        }

        for (String[] row: arr2d) {
            for (String col: row) {
                System.out.print(col + '\t');
            }
            System.out.println();
        }
    }
}
