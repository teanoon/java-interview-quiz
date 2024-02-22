package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SimpleServiceTest {

    private SimpleService service = new SimpleService();

    @Test
    public void canFillGapSuccess() {
        assertTrue(service.canFillGap(3, 1, 9));
        assertFalse(service.canFillGap(4, 1, 8));
        assertTrue(service.canFillGap(3, 2, 10));
    }

    @Test
    public void lengthEncodeSuccess() {
        assertEquals("1a1b1c", service.lengthEncode("abc"));
        assertEquals("3a2b1c", service.lengthEncode("aaabbc"));
        String input = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW";
        assertEquals("12W1B12W3B24W1B14W", service.lengthEncode(input));
    }

    @Test
    public void reverseSuccess() {
        assertEquals(0, service.reverse(0));
        assertEquals(1, service.reverse(10));
        assertEquals(8845671, service.reverse(1765488));
    }

}
