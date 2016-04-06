package se.krydd.game;

import se.krydd.boardentity.BoardEntity;

import java.util.ArrayList;
import java.util.Collection;

public class Board {
    private final Player player1;
    private final Player player2;
    private final Collection<BoardEntity> boardEntities = new ArrayList<>();

    public Board(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
}
