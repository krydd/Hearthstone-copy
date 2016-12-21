package se.krydd.boardentity.heropower;

import se.krydd.boardentity.BoardEntity;
import se.krydd.game.PlayerId;

public abstract class HeroPower implements BoardEntity {
    private final PlayerId owner;

    protected HeroPower(PlayerId owner) {
        this.owner = owner;
    }

    @Override
    public PlayerId getOwner() {
        return owner;
    }
}
