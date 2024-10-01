import com.champlain.oop2assignment3.CardCollection;

public class ScoringStrategies implements ScoringStrategy {

    @Override
    public int calculateScore(CardCollection pCards) {
        return pCards.size();
    }
}
