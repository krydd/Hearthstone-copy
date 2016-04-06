package se.krydd.game.engine;

import se.krydd.game.PlayerId;
import se.krydd.util.RandomUtil;

public class Turn {
    public static final int MAX_NUMBER_OF_TURNS = 50;
    private final PlayerId startingPlayer;
    private final PlayerId player1 = PlayerId.Player1;
    private final PlayerId player2 = PlayerId.Player2;
    private int turn;
    private PlayerId currentPlayer;

    public static Turn createTurnForNewGame() {
        final PlayerId startingPlayer = RandomUtil.randomPickObject(PlayerId.Player1, PlayerId.Player2);
        return new Turn(startingPlayer, 0);
    }

    public Turn(PlayerId startingPlayer, int turn) {
        this.startingPlayer = startingPlayer;
        this.turn = turn;
    }

    public void nextTurn() {
        if (currentPlayer == null) {
            currentPlayer = startingPlayer;
        } else {
            currentPlayer = nextPlayer();
        }
        turn += 1;
    }

    private PlayerId nextPlayer() {
        return currentPlayer == player1 ? player2 : player1;
    }

    public boolean maxNumberOfTurnsExceeded() {
        return turn > MAX_NUMBER_OF_TURNS;
    }
}
