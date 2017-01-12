package com.bhushan.Java.Smiley;

import javax.swing.*;

/**
 * Created by bhushan on 12/29/16.
 */
public class DrawSmileyTest {
    public static void main(String[] args) {
        DrawSmiley panel = new DrawSmiley();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(230, 250);
        app.setVisible(true);
    }
}
