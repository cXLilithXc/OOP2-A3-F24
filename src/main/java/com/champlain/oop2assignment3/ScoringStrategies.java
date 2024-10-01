package com.champlain.oop2assignment3;

public class ScoringStrategies implements ScoringStrategy{

    @Override
    public int calculateScore(CardCollection pCards) {
        return pCards.size();
    }

    // New method to calculate the number of Aces
    public int countAces(CardCollection pCards) {
        int aceCount = 0;
        for (Card card : pCards) {
            if (card.getRank() == Rank.ACE) {
                aceCount++;
            }
        }
        return aceCount;
    }
}

