package se.krydd.boardentity.minion.sets.basic;

import se.krydd.boardentity.minion.Minion;
import se.krydd.boardentity.minion.attributes.Taunt;
import se.krydd.card.Card;
import se.krydd.card.cardsets.basic.IronbarkProtectorCard;

public class IronbarkProtectorMinion extends Minion implements Taunt {
    @Override
    public Class<? extends Card> cardClass() {
        return IronbarkProtectorCard.class;
    }
}
