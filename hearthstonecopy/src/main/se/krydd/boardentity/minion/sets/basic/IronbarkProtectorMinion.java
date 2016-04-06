package se.krydd.boardentity.minion.sets.basic;

import se.krydd.boardentity.minion.Minion;
import se.krydd.boardentity.minion.attributes.Taunt;
import se.krydd.card.Card;
import se.krydd.card.cardsets.basic.IronbarkProtectorCard;
import se.krydd.game.PlayerId;

public class IronbarkProtectorMinion extends Minion implements Taunt {

    public IronbarkProtectorMinion(PlayerId owner) {
        super(owner);
    }

    @Override
    public Class<? extends Card> cardClass() {
        return IronbarkProtectorCard.class;
    }
}
