package se.krydd.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class JU_RandomUtil {
    @Test
    public void testName() throws Exception {
        RandomUtil.uniqueRandomNumbersInInterval(0, 86, 4).forEach(System.out::println);

    }
}