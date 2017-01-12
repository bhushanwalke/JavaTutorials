package com.bhushan.Java.Arrays.CardGames;

/**
 * Created by bhushan on 12/29/16.
 */
public class Card {

    private final String face;
    private final String suit;


    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public String toString() {
        return face + " of " + suit;
    }
}
