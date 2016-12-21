package se.krydd.game;

import se.krydd.boardentity.heropower.HeroPower;
import se.krydd.boardentity.heropower.StandardHeroPowers;

public class Player {
    private final PlayerId playerId;
    private final HeroClass heroClass;
    private final Mana mana = new Mana();
    private final Deck deck = new Deck();
    private final Hand hand = new Hand();
    private final HeroPower heroPower;
    private final Graveyard graveyard = new Graveyard();

    public Player(PlayerId playerId, HeroClass heroClass) {
        this.playerId = playerId;
        this.heroClass = heroClass;
        this.heroPower = StandardHeroPowers.forClass(heroClass);
    }

    public PlayerId getId() {
        return playerId;
    }
}
