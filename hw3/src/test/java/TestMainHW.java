import hw.MainHW;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMainHW {
    @Test
    public void testOddNumber() {
        assertTrue(MainHW.evenOddNumber(2));
    }

    @Test
    public void testEvenNumber() {
        assertFalse(MainHW.evenOddNumber(1));
    }

    @Test
    public void testNumberLessInterval() {
        assertFalse(MainHW.numberInInterval(0));
    }

    @Test
    public void testNumberInInterval() {
        assertTrue(MainHW.numberInInterval(50));
    }

    @Test
    public void testNumberGreaterInterval() {
        assertFalse(MainHW.numberInInterval(1000));
    }
}
