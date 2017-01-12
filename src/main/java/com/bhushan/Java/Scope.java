package com.bhushan.Java;

/**
 * Created by bhushan on 12/29/16.
 */
public class Scope {
    private static int x = 1;

    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        System.out.println("x in main: " + x);

        useLocalVariable();
        useField();
        useLocalVariable();
        useField();

        System.out.println("x in main after: " + x);
        System.out.println("x of Scope class: " + Scope.x);

        changeValue(y);
        System.out.println("y in main: " + y);
    }

    private static void useLocalVariable() {
        int x = 25;
        System.out.println("local x in useLocalVariable before: " + x);
        System.out.println("local x in useLocalVariable after: " + ++x);
    }

    private static void useField() {
        System.out.println("field x in useField before: " + x);
        x *= 10;
        System.out.println("field x in useField after: " + x);
    }

    private static void changeValue(int y) {
        y *= 10;
        System.out.println("Y in changeValue: " + y);
    }
}
