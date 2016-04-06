package se.krydd.game;

import se.krydd.card.Card;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static se.krydd.util.CollectionUtil.removeElementsAtIndicesFromList;
import static se.krydd.util.RandomUtil.uniqueRandomNumbersInInterval;

public class Hand {
    private final static int HAND_MAX_CARDS = 10;

    private final List<Card> cards = new ArrayList<>(HAND_MAX_CARDS);

    public void addCard(Card card) {
        if (numberOfCardsInHand() < HAND_MAX_CARDS) {
            cards.add(card);
        }
        //TODO: Mark card is burned?
    }

    public int numberOfCardsInHand() {
        return cards.size();
    }

    public Collection<Card> discardCards(int numberOfCardsToDiscard) {
        final List<Integer> integers = uniqueRandomNumbersInInterval(0, numberOfCardsInHand(), numberOfCardsToDiscard);
        return removeElementsAtIndicesFromList(integers, cards);
    }

    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }

    public Card removeCard(int index) {
        return cards.remove(index);
    }
}
