import org.junit.jupiter.api.*;

public class FirstTest {
    @Test
    void firstTest() {
        Assertions.assertTrue(3 >= 2);
    }

    @Test
    void secondTest() {
        Assertions.assertFalse(3 == 1);
    }
}
