package com.bhushan.Java.Arrays.CardGames;

/**
 * Created by bhushan on 12/29/16.
 */
public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shuffle();

        for (int i=1; i <= 52; i++) {
//            System.out.println(deckOfCards.dealCard());
        }

        Card[] test = new Card[5];
        test[2] = new Card("asd", "qwe");

        for(Card c: test) {
            System.out.println("in test");
            System.out.println(c);
        }

        for (int i=0; i<test.length; i++) {
            System.out.println(test[i]);
        }
    }
}
