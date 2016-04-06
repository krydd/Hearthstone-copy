package se.krydd.boardentity.minion.sets.basic;

import se.krydd.game.Board;
import se.krydd.game.HeroClass;
import se.krydd.game.PlayerId;
import se.krydd.boardentity.minion.Minion;
import se.krydd.card.Card;
import se.krydd.card.CardSet;
import se.krydd.card.attributes.TargetEnemyMinionsSpell;
import se.krydd.spelleffects.SwapMinionOwner;

public class MindControlCard extends Card implements TargetEnemyMinionsSpell {

    public MindControlCard(PlayerId owner) {
        super(owner);
    }

    @Override
    public String cardText() {
        return "Take control of an enemy minion.";
    }

    @Override
    protected int baseCost() {
        return 10;
    }

    @Override
    public CardSet set() {
        return CardSet.Basic;
    }

    @Override
    public HeroClass heroClass() {
        return HeroClass.Preist;
    }

    @Override
    public boolean isValidTarget(Minion targetedMinion) {
        return true;
    }

    @Override
    public void onCast(Board board, Minion targetedMinion) {
        SwapMinionOwner.swap(targetedMinion);
    }
}
