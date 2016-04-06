package se.krydd.boardentity.minion;

import se.krydd.boardentity.BoardEntity;
import se.krydd.boardentity.minion.attributes.MinionBuff;
import se.krydd.card.Card;
import se.krydd.game.PlayerId;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Minion implements BoardEntity {
    private final Collection<MinionBuff> buffs = new ArrayList<>();
    private PlayerId owner;

    protected Minion(PlayerId owner) {
        this.owner = owner;
    }

    public abstract Class<? extends Card> cardClass();

    public PlayerId getOwner() {
        return owner;
    }
}
