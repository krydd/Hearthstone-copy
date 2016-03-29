package se.krydd.card.cardsets.basic;

import se.krydd.HeroClass;
import se.krydd.boardentity.minion.Minion;
import se.krydd.boardentity.minion.sets.basic.IronbarkProtectorMinion;
import se.krydd.card.Card;
import se.krydd.card.CardSet;
import se.krydd.card.attributes.SpawnsMinion;

public class IronbarkProtectorCard extends Card implements SpawnsMinion {
    @Override
    public String cardText() {
        return "";
    }

    @Override
    public int baseCost() {
        return 8;
    }

    @Override
    public Minion getMinion() {
        return new IronbarkProtectorMinion();
    }

    @Override
    public CardSet set() {
        return CardSet.Basic;
    }

    @Override
    public HeroClass heroClass() {
        return HeroClass.Druid;
    }
}
