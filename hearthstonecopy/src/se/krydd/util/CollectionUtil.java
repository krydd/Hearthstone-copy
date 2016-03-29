package se.krydd.util;

import java.util.Collection;
import java.util.stream.Collectors;

public class CollectionUtil {

    public static <T> Collection<T> filterClass(Collection<?> collection, Class<T> wantedClass) {
        return collection.stream()
                .filter(e -> wantedClass.isAssignableFrom(e.getClass()))
                .map(wantedClass::cast)
                .collect(Collectors.toList());
    }
}
