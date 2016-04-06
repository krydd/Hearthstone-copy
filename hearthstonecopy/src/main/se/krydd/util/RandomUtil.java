package se.krydd.util;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomUtil {
    private static final Random random = new Random();

    public static List<Integer> uniqueRandomNumbersInInterval(int min, int max, int wantedNumberOfRandoms) {
        final List<Integer> numbers = IntStream.rangeClosed(min, max)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(numbers);

        final int numberOfRandoms = Math.min(max - min + 1, wantedNumberOfRandoms);
        final List<Integer> integers = numbers.subList(0, numberOfRandoms);
        integers.sort(Comparator.<Integer>naturalOrder());
        return integers;
    }

    @SafeVarargs
    public static <T> T randomPickObject(T... objects) {
        final int indexToPick = random.nextInt(objects.length - 1);
        return objects[indexToPick];
    }
}
