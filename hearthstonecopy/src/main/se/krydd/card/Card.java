package se.krydd.card;

import se.krydd.game.HeroClass;
import se.krydd.game.PlayerId;
import se.krydd.card.modifiers.CardModifier;
import se.krydd.card.modifiers.CostCardModifier;
import se.krydd.util.CollectionUtil;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Card {
    private final PlayerId owner;
    private final Collection<CardModifier> modifiers = new ArrayList<>();

    protected Card(PlayerId owner) {
        this.owner = owner;
    }

    public void addModifier(CardModifier cardModifier) {
        modifiers.add(cardModifier);
    }

    public int cost() {
        return baseCost() - getModifiersOfClass(CostCardModifier.class).stream()
                .mapToInt(CostCardModifier::getCardCost)
                .sum();
    }

    private <T> Collection<T> getModifiersOfClass(Class<T> cardModifierClass) {
        return CollectionUtil.filterClass(modifiers, cardModifierClass);
    }

    public abstract String cardText();

    protected abstract int baseCost();

    public abstract CardSet set();

    public abstract HeroClass heroClass();

    protected PlayerId getOwner() {
        return owner;
    }
}
