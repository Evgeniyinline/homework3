package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void firstTest() {
        Assertions.assertFalse(5 < 1);

    }
    @Test
    void secondTest() {
        Assertions.assertTrue(25!=1);

    }
}
