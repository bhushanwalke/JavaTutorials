package com.bhushan.Java.Arrays.CardGames;

import java.security.SecureRandom;

/**
 * Created by bhushan on 12/29/16.
 */
public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;

    private static final SecureRandom randomNumber = new SecureRandom();

    public DeckOfCards() {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;

        for (int firstCard = 0; firstCard < deck.length; firstCard++) {
            int secondCard = randomNumber.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[firstCard];
            deck[firstCard] = deck[secondCard];
            deck[secondCard] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    }
}
