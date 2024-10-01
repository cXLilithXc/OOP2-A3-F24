package com.champlain.oop2assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterable card collection overriding toString method.
 * String output contains all cards in the collection separated by new line chars.
 */
public abstract class CardCollection implements Iterable<Card>{
    //me
    private final List<Card> cards = new ArrayList<>();
    //me
    public void addCard(Card card) {
        cards.add(card);
    }
    //me
    public int size() {
        return cards.size();
    }
    //me
    @Override
    public Iterator<Card> iterator() {
        return cards.iterator();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card currentCard : this) {
            result.append(currentCard.toString()).append("\n");
        }
        return result.toString();
    }
}
