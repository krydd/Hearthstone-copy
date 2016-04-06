package se.krydd.game;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Mana {
    private static final int MAX_MANA_AND_CRYSTALS = 10;
    private static final int START_MANA = 0;
    private static final int START_CRYSTALS = 0;

    private int mana;
    private int crystals;
    private int overloaded = 0;
    private int toOverload = 0;
    private int temporaryCrystals = 0;

    public Mana() {
        mana = START_MANA;
        crystals = START_CRYSTALS;
    }

    public void nextTurn() {
        crystals -= temporaryCrystals;
        temporaryCrystals = 0;
        crystals = min(MAX_MANA_AND_CRYSTALS, crystals + 1);
        overloaded = min(crystals, toOverload);
        toOverload = 0;
        mana = max(0, crystals - overloaded);
    }

    public int getMana() {
        return mana;
    }

    public int getOverloaded() {
        return overloaded;
    }

    public void overloadMana(int crystalsOverloaded) {
        assert crystalsOverloaded > 0;
        toOverload += crystalsOverloaded;
    }

    public void clearOverload() {
        toOverload = 0;
        mana += overloaded;
        overloaded = 0;
    }

    public void addManaThisTurnOnly(int manaAdded) {
        assert manaAdded > 0;
        mana = min(MAX_MANA_AND_CRYSTALS, mana + manaAdded);
        temporaryCrystals = min(mana, crystals + manaAdded) - crystals;
        crystals += temporaryCrystals;
    }

    public void addRemoveManaCrystals(int delta) {
        crystals = min(MAX_MANA_AND_CRYSTALS, crystals + delta);
        mana = min(crystals, mana);
    }
}
