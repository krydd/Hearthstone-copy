package se.krydd.card.attributes;

import se.krydd.game.Board;
import se.krydd.boardentity.minion.Minion;

public interface TargetEnemyMinionsSpell {
    boolean isValidTarget(Minion targetedMinion);

    void onCast(Board board, Minion targetedMinion);
}
