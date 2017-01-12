package com.bhushan.Java.Classes;


import java.math.BigInteger;

/**
 * Created by bhushan on 12/31/16.
 */
public class StaticMembers {

    private static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        StaticMembers.count = count;
    }

    public static void main(String[] args) {
        StaticMembers s1 = new StaticMembers();
        s1.setCount(s1.getCount() + 1);
        System.out.printf("Count: %d", count);

        StaticMembers s2 = new StaticMembers();
        s2.setCount(s2.getCount() + 1);
        System.out.printf("Count: %d", count);


//        BigInteger temp = new BigInteger(String.valueOf(Math.pow(2.0, 2.0)));
//        System.out.println(temp.abs());
    }
}


