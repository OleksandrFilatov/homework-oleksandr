package homeWork11_06;


import main.homeWork11_06.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilsTest {

    @Test
    public void testGetEvenElements() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 4, 6};

        assertArrayEquals(expected, ArrayUtils.getEvenElements(input));
    }

    @Test
    public void testGetEvenElements_AllOdd() {
        int[] input = {1, 3, 5};
        int[] expected = {};

        assertArrayEquals(expected, ArrayUtils.getEvenElements(input));
    }

    @Test
    public void testGetAverage() {
        int[] input = {2, 4, 6, 8};
        double expected = 5.0;

        assertEquals(expected, ArrayUtils.getAverage(input), 0.0001);
    }

    @Test
    public void testGetAverage_EmptyArray() {
        int[] input = {};
        double expected = 0.0;

        assertEquals(expected, ArrayUtils.getAverage(input), 0.0001);
    }
}
