package org.ntuhpi.task2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonthTest {

    @Test
    public void testGetPreviousMonth() {
        Month january = Month.СІЧЕНЬ;
        assertEquals(Month.ГРУДЕНЬ, january.getPreviousMonth());
    }

    @Test
    public void testGetNextMonth() {
        Month december = Month.ГРУДЕНЬ;
        assertEquals(Month.СІЧЕНЬ, december.getNextMonth());
    }

    @Test
    public void testGetSeason() {
        Month march = Month.БЕРЕЗЕНЬ;
        assertEquals("Весна", march.getSeason());

        Month july = Month.ЛИПЕНЬ;
        assertEquals("Літо", july.getSeason());

        Month september = Month.ВЕРЕСЕНЬ;
        assertEquals("Осінь", september.getSeason());

        Month december = Month.ГРУДЕНЬ;
        assertEquals("Зима", december.getSeason());
    }
}
