package com.champlain.oop2assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a hand of playing cards.
 * <p>
 * This class allows for adding cards to the hand and checking if the hand is empty.
 * It also provides an iterator to traverse the cards in the hand.
 * </p>
 */
public class Hand extends CardCollection {

    public boolean isEmpty() {
        return size() == 0;
    }


}
