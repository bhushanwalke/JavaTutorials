package com.bhushan.Java.Classes;

/**
 * Created by bhushan on 12/30/16.
 */
public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time = new CustomTime();
        displayTime("Object created", time);

        time.setTime(13, 27, 6);
        displayTime("Called setTime", time);

        try {
            time.setTime(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e);
        }

        displayTime("After invalid values", time);
    }

    private static void displayTime(String header, CustomTime time) {
        System.out.printf("%s%nUTC: %s%nStandard: %s%n%n", header, time.toUniversalString(), time);
    }
}
