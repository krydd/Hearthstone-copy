package se.krydd.game.engine;

import se.krydd.card.Card;
import se.krydd.game.Board;
import se.krydd.game.HeroClass;
import se.krydd.game.Player;
import se.krydd.game.PlayerId;

public class GameEngine {
    private final Board board;
    private final Turn turn;

    public static GameEngine newGame(HeroClass player1HeroClass, HeroClass player2HeroClass) {
        final Player player1 = new Player(PlayerId.Player1, player1HeroClass);
        final Player player2 = new Player(PlayerId.Player2, player2HeroClass);
        final Board board = new Board(player1, player2);
        final Turn turn = Turn.createTurnForNewGame();
        return new GameEngine(board, turn);
    }

    GameEngine(Board board, Turn turn) {
        this.board = board;
        this.turn = turn;
    }

    public void nextTurn() {
        endTurnPhase();
        turn.nextTurn();
        if (turn.maxNumberOfTurnsExceeded()) {
            //TODO: Draw game
        }
        newTurnPhase();
    }

    public void endTurnPhase() {
    }

    private void newTurnPhase() {

    }

    public void playCard(Card card) {
        if (card.getOwner() != turn.getCurrentPlayer()) {
            return;
        }

    }

    public void attackWithEntity() {

    }
}
