package se.krydd.game;

public class Player {
    private final PlayerId playerId;
    private final HeroClass heroClass;
    private final Mana mana = new Mana();
    private final Deck deck = new Deck();
    private final Hand hand = new Hand();
    private final Graveyard graveyard = new Graveyard();

    public Player(PlayerId playerId, HeroClass heroClass) {
        this.playerId = playerId;
        this.heroClass = heroClass;
    }

    public PlayerId getId() {
        return playerId;
    }
}
