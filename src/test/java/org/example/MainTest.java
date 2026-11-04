package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void greatesttest() {
        assertEquals(20, Main.greatest(10, 20));
        assertEquals(30, Main.greatest(30, 10));
        assertEquals(10, Main.greatest(10, 10));
    }
}
