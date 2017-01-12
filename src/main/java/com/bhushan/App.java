package com.bhushan;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();

        temp.put(1, 2);

        System.out.println(temp.get(1));
    }
}
