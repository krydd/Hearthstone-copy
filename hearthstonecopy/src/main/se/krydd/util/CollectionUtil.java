package se.krydd.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionUtil {

    public static <T> Collection<T> filterClass(Collection<?> collection, Class<T> wantedClass) {
        return collection.stream()
                .filter(e -> wantedClass.isAssignableFrom(e.getClass()))
                .map(wantedClass::cast)
                .collect(Collectors.toList());
    }

    public static <T> Collection<T> removeElementsAtIndicesFromList(Collection<Integer> indices, List<T> listToRemoveFrom) {
        final Collection<T> removedCards = new ArrayList<>();
        int loopCount = 0;
        final Iterator<T> iterator = listToRemoveFrom.iterator();
        while (iterator.hasNext()) {
            final T element = iterator.next();
            if (indices.contains(loopCount)) {
                iterator.remove();
                removedCards.add(element);
            }
            loopCount++;
        }

        assert removedCards.size() == indices.size();
        return removedCards;
    }
}
